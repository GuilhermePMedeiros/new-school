package br.com.newschool.people;

import java.util.Date;

import br.com.newschool.core.base.ObjectBase;
import br.com.newschool.core.utils.indicators.IndSex;

public class People extends ObjectBase{
	
	// Serial ID
	private static final long serialVersionUID = 6960086026142180359L;
	
	// Attributes 
	private String cpf;
	private String rg;
	private String name;
	private Date dtBirth;
	private IndSex sex;
	
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
	
	public IndSex getSex() {
		return sex;
	}
	
	public void setSex(IndSex sex) {
		this.sex = sex;
	}
	
	// Override of the method toString
	@Override
	public String toString() {
		return "id: " + this.getId() + ", cpf=" + cpf + ", rg=" + rg + ", name=" + name + ", dtBirth=" + dtBirth + ", sex=" + sex;
	}
	
}
