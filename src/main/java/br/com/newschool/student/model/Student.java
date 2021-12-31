package br.com.newschool.student.model;

import java.util.Date;

import javax.persistence.Entity;

import br.com.newschool.address.Address;
import br.com.newschool.core.utils.indicators.IndSex;
import br.com.newschool.people.model.People;

/**
 * @author guilherme.pacheco
 * @version 2.0
 * Date: 28/12/2021
 * */

@Entity
public class Student extends People{

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 2333213907462020932L;
	
	// Builds
	public Student() {
		super();
	}

	public Student(int id) {
		super(id);
	}
	
	public Student(int id, String cpf) {
		super(id, cpf);
	}

	public Student(int id, String cpf, String rg) {
		super(id, cpf, rg);
	}

	public Student(int id, String cpf, String rg, String name) {
		super(id, cpf, rg, name);
	}

	public Student(int id, String cpf, String rg, String name, Date dtBirth) {
		super(id, cpf, rg, name, dtBirth);
	}

	public Student(int id, String cpf, String rg, String name, Date dtBirth, IndSex sex) {
		super(id, cpf, rg, name, dtBirth, sex);
	}
	
	public Student(int id, String cpf, String rg, String name, Date dtBirth, IndSex sex, Address address) {
		super(id, cpf, rg, name, dtBirth, sex, address);
	}
	
	// TODO Edit Method
	@Override
	public String toString() {
		return "...";
	}
	
	//Clone Method
	@Override
	public Student clone() throws CloneNotSupportedException {
		return new Student (getId(), getCpf(), getRg(), getName(), getDtBirth(), getSex(), getAddress());
	}
	
	// Override of the method toString
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		if (this.getCpf() == null) {
			return other.getCpf() == null;
		} else {
			return this.getCpf().equals(other.getCpf());
		}
	}
	
}
