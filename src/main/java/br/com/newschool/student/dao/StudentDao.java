package br.com.newschool.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.newschool.core.base.dao.ObjectDaoBase;
import br.com.newschool.student.model.Student;
import br.com.newschool.student.studentslist.StudentsList;
import br.com.newschool.utils.hibernate.HibernateHelper;

/**
 * @author guilherme.pacheco
 * @version 3.0 
 * Date: 28/12/2021
 */

public class StudentDao extends ObjectDaoBase<Student> {

	// Attributes
	private static StudentDao unicaInstancia;
	private EntityManager entityManager;

	// Singleton pattern method
	public static synchronized StudentDao getInstance() {
		if (unicaInstancia == null)
			unicaInstancia = new StudentDao();

		return unicaInstancia;
	}

	// Builder
	private StudentDao() {
		super();
		entityManager = HibernateHelper.getEntityManager();
	}

	// Overrides Methods
	// Get List<Student>
	@Override
	public List<Student> getObjectsList() {
		try {
			// JPQl command  
			String jpql = "select s from Student s";
			// Type query 
			TypedQuery<Student> typeQuery = entityManager.createQuery(jpql, Student.class);
			// Return List<Student>
			return typeQuery.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Get cloned List<Student> 
	@Override
	public List<Student> getClonedObjectList() {
		// Returning cloned List<Student>
		return new StudentsList(getObjectsList()).getClonedObjectsList();
	}

	// Add Student
	@Override
	public void addObject(Student student) {
		try {
			// Initialize transaction
			entityManager.getTransaction().begin();
			// Persisting student
			entityManager.persist(student);
			// Commit transaction
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	// Find Student
	@Override
	public Student findObjectById(int id) {
		try {
			
			// (JPQL) _________________________________________________________________________
			
			// String jpql = "select s from Student s where s.id = " + id;
			// TypedQuery<Student> typeQuery = entityManager.createQuery(jpql, Student.class);
			// return typeQuery.getSingleResult();
		
			// _________________________________________________________________________________
			
			// Returning Student
			return entityManager.find(Student.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Update Student
	//  TODO: Atualizar a classe pai... (Student student)
	@Override
	public void UpdateObjectById(int id, Student student) {
		try {
			// Initialize transaction
			entityManager.getTransaction().begin();
			// Merge method to student
			entityManager.merge(student);
			// Commit transaction
            entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	// Remove Student by id
	@Override
	public void removeObjectById(int id) {
		try {
			// Initialize transaction
			entityManager.getTransaction().begin();
			// Remove Student
			entityManager.remove(findObjectById(id));
			// Commit transaction
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	// Remove all Students by id with List<Students>
	@Override
	public void removeAllObjectsById(List<Student> students) {
		try {
			// For each student
			for (Student student : students) {
				// Remove by id
				removeObjectById(student.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Remove all students by id with int[] ids
	@Override
	public void removeAllObjectsById(int[] ids) {
		try {
			// For each id
			for (int id : ids) {
				// Remove by id
				removeObjectById(id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
