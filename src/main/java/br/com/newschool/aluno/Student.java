package br.com.newschool.aluno;

import java.util.Date;

import br.com.newschool.core.utils.indicators.IndSex;
import br.com.newschool.people.People;
import br.com.newschool.utils.indicators.IndDayShifts;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 07/12/2021
 * */

public class Student extends People {

	// Serial ID
	private static final long serialVersionUID = 2333213907462020932L;
	
	// Attributes
	private IndDayShifts shift;

	// Builds
	public Student() {
		super();
	}

	public Student(long id) {
		super(id);
	}
	
	public Student(long id, String cpf) {
		super(id, cpf);
	}

	public Student(long id, String cpf, String rg) {
		super(id, cpf, rg);
	}

	public Student(long id, String cpf, String rg, String name) {
		super(id, cpf, rg, name);
	}

	public Student(long id, String cpf, String rg, String name, Date dtBirth) {
		super(id, cpf, rg, name, dtBirth);
	}

	public Student(long id, String cpf, String rg, String name, Date dtBirth, IndSex sex) {
		super(id, cpf, rg, name, dtBirth, sex);
	}
	
	public Student(long id, String cpf, String rg, String name, Date dtBirth, IndSex sex, IndDayShifts shift) {
		super(id, cpf, rg, name, dtBirth, sex);
		this.shift = shift;
	}
	
	// Gets and Sets
	public IndDayShifts getShift() {
		return shift;
	}

	public void setShift(IndDayShifts shift) {
		this.shift = shift;
	}

	// TODO Edit Method
	@Override
	public String toString() {
		return "...";
	}
	
}
