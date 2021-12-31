package br.com.newschool.people.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.newschool.address.Address;
import br.com.newschool.core.base.model.ObjectBase;
import br.com.newschool.core.utils.indicators.IndSex;
import br.com.newschool.core.utils.model.date.DateHelper;

/**
 * @author guilherme.pacheco
 * @version 2.0 Date: 28/12/2021
 */

@Entity
public abstract class People extends ObjectBase {

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 6960086026142180359L;

	// Attributes
	private String cpf;
	private String rg;
	private String name;
	private Date dtBirth;
	private IndSex sex;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	// Builds
	public People() {
		super();
	}

	public People(int id) {
		super(id);
	}

	public People(int id, String cpf) {
		super(id);
		this.cpf = cpf;
	}

	public People(int id, String cpf, String rg) {
		super(id);
		this.cpf = cpf;
		this.rg = rg;
	}

	public People(int id, String cpf, String rg, String name) {
		super(id);
		this.cpf = cpf;
		this.rg = rg;
		this.name = name;
	}

	public People(int id, String cpf, String rg, String name, Date dtBirth) {
		super(id);
		this.cpf = cpf;
		this.rg = rg;
		this.name = name;
		this.dtBirth = dtBirth;
	}

	public People(int id, String cpf, String rg, String name, Date dtBirth, IndSex sex) {
		super(id);
		this.cpf = cpf;
		this.rg = rg;
		this.name = name;
		this.dtBirth = dtBirth;
		this.sex = sex;
	}

	public People(int id, String cpf, String rg, String name, Date dtBirth, IndSex sex, Address address) {
		super(id);
		this.cpf = cpf;
		this.rg = rg;
		this.name = name;
		this.dtBirth = dtBirth;
		this.sex = sex;
		this.address = address;
	}

	// Gets and sets
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDtBirth() {
		return dtBirth;
	}

	public void setDtBirth(Date dtBirth) {
		this.dtBirth = dtBirth;
	}

	public String getFormatedDtBirth() {
		return DateHelper.getFormatedData(dtBirth);
	}

	public IndSex getSex() {
		return sex;
	}

	public void setSex(IndSex sex) {
		this.sex = sex;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// Override of the method toString
	@Override
	public String toString() {
		return "id: " + this.getId() + ", cpf=" + cpf + ", rg=" + rg + ", name=" + name + ", dtBirth=" + dtBirth
				+ ", sex=" + sex;
	}

}
