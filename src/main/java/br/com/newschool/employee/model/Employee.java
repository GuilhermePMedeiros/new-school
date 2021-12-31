package br.com.newschool.employee.model;

import java.util.Date;

import javax.persistence.Entity;

import br.com.newschool.address.Address;
import br.com.newschool.core.utils.indicators.IndSex;
import br.com.newschool.people.model.People;
import br.com.newschool.utils.indicators.IndDepartment;

/**
 * @author guilherme.pacheco
 * @version 1.0 Date: 30/12/2021
 */
@Entity
public class Employee extends People {

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = -1731064889623025793L;

	// Attributes
	private IndDepartment department;
	private String nameOccupation;

	// Builds
	public Employee() {
		super();
	}
	
	public Employee(int id, String cpf, String rg, String name, Date dtBirth, IndSex sex, Address address, IndDepartment department, String nameOccupation) {
		super(id, cpf, rg, name, dtBirth, sex, address);
		this.department = department;
		this.nameOccupation = nameOccupation;
	}

	// Gets and Sets
	public IndDepartment getDepartment() {
		return department;
	}

	public void setDepartment(IndDepartment department) {
		this.department = department;
	}

	public String getNameOccupation() {
		return nameOccupation;
	}

	public void setNameOccupation(String nameOccupation) {
		this.nameOccupation = nameOccupation;
	}

	// TODO: ToString
	@Override
	public String toString() {
		return "Employee [department=" + department + ", nameOccupation=" + nameOccupation + "]";
	}
	
	//Clone Method
	@Override
	public Employee clone() throws CloneNotSupportedException {
		return new Employee (getId(), getCpf(), getRg(), getName(), getDtBirth(), getSex(), getAddress(), getDepartment(), getNameOccupation());
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
		Employee other = (Employee) obj;
		if (this.getCpf() == null) {
			return other.getCpf() == null;
		} else {
			return this.getCpf().equals(other.getCpf());
		}
	}
}
