package br.com.newschool.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.newschool.core.base.dao.ObjectDaoBase;
import br.com.newschool.employee.employeeslist.EmployeesList;
import br.com.newschool.employee.model.Employee;
import br.com.newschool.utils.hibernate.HibernateHelper;

/**
 * @author guilherme.pacheco
 * @version 3.0 
 * Date: 28/12/2021
 */

public class EmployeeDao extends ObjectDaoBase<Employee> {

	// Attributes
	private static EmployeeDao unicaInstancia;
	private EntityManager entityManager;

	// Singleton pattern method
	public static synchronized EmployeeDao getInstance() {
		if (unicaInstancia == null)
			unicaInstancia = new EmployeeDao();

		return unicaInstancia;
	}

	// Builder
	private EmployeeDao() {
		super();
		entityManager = HibernateHelper.getEntityManager();
	}

	// Overrides Methods
	// Get List<Employee>
	@Override
	public List<Employee> getObjectsList() {
		try {
			// JPQl command  
			String jpql = "select s from Employee s";
			// Type query 
			TypedQuery<Employee> typeQuery = entityManager.createQuery(jpql, Employee.class);
			// Return List<Employee>
			return typeQuery.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Get cloned List<Employee> 
	@Override
	public List<Employee> getClonedObjectList() {
		// Returning cloned List<Employee>
		return new EmployeesList(getObjectsList()).getClonedObjectsList();
	}

	// Add Employee
	@Override
	public void addObject(Employee employee) {
		try {
			// Initialize transaction
			entityManager.getTransaction().begin();
			// Persisting Employee
			entityManager.persist(employee);
			// Commit transaction
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	// Find Employee
	@Override
	public Employee findObjectById(int id) {
		try {
			
			// (JPQL) _________________________________________________________________________
			
			// String jpql = "select s from Employee s where s.id = " + id;
			// TypedQuery<Employee> typeQuery = entityManager.createQuery(jpql, Employee.class);
			// return typeQuery.getSingleResult();
		
			// _________________________________________________________________________________
			
			// Returning Employee
			return entityManager.find(Employee.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Update Employee
	//  TODO: Atualizar a classe pai... (Employee Employee)
	@Override
	public void UpdateObjectById(int id, Employee employee) {
		try {
			// Initialize transaction
			entityManager.getTransaction().begin();
			// Merge method to Employee
			entityManager.merge(employee);
			// Commit transaction
            entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	// Remove Employee by id
	@Override
	public void removeObjectById(int id) {
		try {
			// Initialize transaction
			entityManager.getTransaction().begin();
			// Remove Employee
			entityManager.remove(findObjectById(id));
			// Commit transaction
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	// Remove all Employees by id with List<Employees>
	@Override
	public void removeAllObjectsById(List<Employee> employees) {
		try {
			// For each Employee
			for (Employee employee : employees) {
				// Remove by id
				removeObjectById(employee.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Remove all Employees by id with int[] ids
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
