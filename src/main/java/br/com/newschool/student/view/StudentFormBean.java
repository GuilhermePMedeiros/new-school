package br.com.newschool.student.view;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;

import br.com.newschool.student.model.Student;

@ViewScoped
public class StudentFormBean extends StudentBean {

	// Attributes
	private Student student;
	
	// Post Construct
	@PostConstruct
	private void init() {
		this.setStudent(new Student());
	}

	// Gets & Sets
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
