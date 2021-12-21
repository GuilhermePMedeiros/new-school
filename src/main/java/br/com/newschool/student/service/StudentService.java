package br.com.newschool.student.service;

import java.util.List;

import br.com.newschool.core.base.ObjectServiceBase;
import br.com.newschool.student.dao.StudentDao;
import br.com.newschool.student.model.Student;

public class StudentService implements ObjectServiceBase<Student>{
	
	// Attributes
	private StudentDao studentDao;
	
	public StudentService() {
		studentDao = StudentDao.getInstance();
	}
	
	// Gets StudentList
	public List<Student> getStudentsList(){
		return studentDao.getClonedObjectList();
	}
	
	// Override Methods
	@Override
	public void addObject(Student student) {
		studentDao.addObject(student);
	}

	@Override
	public Student findObjectById(int id) {
		return studentDao.findObjectById(id);
	}

	@Override
	public void UpdateObjectById(int id, Student student) {
		studentDao.UpdateObjectById(id, student);
	}

	@Override
	public void removeObjectById(int id) {
		studentDao.removeObjectById(id);
	}

	@Override
	public void removeAllObjectsById(List<Student> students) {
		studentDao.removeAllObjectsById(students);
	}

	@Override
	public void removeAllObjectsById(int[] ids) {
		studentDao.removeAllObjectsById(ids);
	}

}
