package br.com.newschool.student.view;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.newschool.student.model.Student;

@Named
@ViewScoped
public class StudentFormBean extends StudentBean {

	@PostConstruct
	private void init() {
		this.setStudent(new Student());
	}

	
}
