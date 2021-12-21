package br.com.newschool.student.dao;

import java.util.List;

import br.com.newschool.core.base.ObjectDaoBase;
import br.com.newschool.student.model.Student;
import br.com.newschool.student.studentslist.StudentsList;

public class StudentDao extends ObjectDaoBase<Student> {

	// Attributes
	private static StudentDao unicaInstancia;
	private StudentsList studentsList;
	
	// Singleton pattern method
	public static synchronized StudentDao getInstance() {
		if (unicaInstancia == null)
			unicaInstancia = new StudentDao();

		return unicaInstancia;
	}

	private StudentDao() {
		super();
		studentsList = new StudentsList();
	}

	// Overrides Methods
	@Override
	public List<Student> getObjectsList() {
		return studentsList.getObjectsList();
	}

	@Override
	public List<Student> getClonedObjectList() {
		return studentsList.getClonedObjectsList();
	}
	
	@Override
	public void addObject(Student student) {
		studentsList.addObject(student);
	}

	@Override
	public Student findObjectById(int id) {
		try {
			return studentsList.findObjectById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void UpdateObjectById(int id, Student student) {
		try {
			studentsList.UpdateObjectById(id, student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeObjectById(int id) {
		try {
			studentsList.removeObjectById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeAllObjectsById(List<Student> students) {
		try {
			studentsList.removeAllObjectsById(students);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void removeAllObjectsById(int[] ids) {
		try {
			studentsList.removeAllObjectsById(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
