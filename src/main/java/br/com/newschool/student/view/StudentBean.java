package br.com.newschool.student.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import br.com.newschool.core.base.ObjectBeanBase;
import br.com.newschool.student.model.Student;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 07/12/2021
 * */

@Named
public class StudentBean implements ObjectBeanBase<Student> {

	// Student object attribute
	private Student student;
	
	@PostConstruct
	private void init() {
		student = new Student();
	}
	
	// gets and sets	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public List<Student> getObjectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void findObjectById() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String UpdateObjectById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeObjectById() {
		// TODO Auto-generated method stub
		return null;
	}
	
}