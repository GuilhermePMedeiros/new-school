package br.com.newschool.address;

import javax.persistence.Entity;

import br.com.newschool.core.base.model.ObjectBase;
import br.com.newschool.core.utils.indicators.IndTypeLogradouro;
import br.com.newschool.core.utils.indicators.IndUF;

/**
 * @author guilherme.pacheco
 * @version 1.0 
 * Date: 29/12/2021
 */

@Entity
public class Address extends ObjectBase {

	// Serial ID
	private static final long serialVersionUID = 9093139033963104180L;

	// Attributes
	private String nickname;
	private IndTypeLogradouro typeLogradouro;
	private String nameLogradouro;
	private int number;
	private String city;
	private IndUF states;
	private String district;
	private String cep;
	private String complement;
	
	// Builders
	public Address() {

	}

	public Address(int id, String nickname, IndTypeLogradouro typeLogradouro, String nameLogradouro, int number, String city,
			IndUF states, String district, String cep, String complement) {
		super(id);
		this.nickname = nickname;
		this.typeLogradouro = typeLogradouro;
		this.nameLogradouro = nameLogradouro;
		this.number = number;
		this.city = city;
		this.states = states;
		this.district = district;
		this.cep = cep;
		this.complement = complement;
	}

	// Gets and Sets	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}	
	
	public IndTypeLogradouro getTypeLogradouro() {
		return typeLogradouro;
	}

	public void setTypeLogradouro(IndTypeLogradouro typeLogradouro) {
		this.typeLogradouro = typeLogradouro;
	}

	public String getNameLogradouro() {
		return nameLogradouro;
	}

	public void setNameLogradouro(String nameLogradouro) {
		this.nameLogradouro = nameLogradouro;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public IndUF getStates() {
		return states;
	}

	public void setStates(IndUF states) {
		this.states = states;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCEP() {
		return cep;
	}

	public void setCEP(String cep) {
		this.cep = cep;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}
	
	// To String
	@Override
	public String toString() {
		return "Address [nickname=" + nickname + ", typeLogradouro=" + typeLogradouro + ", nameLogradouro="
				+ nameLogradouro + ", number=" + number + ", city=" + city + ", states=" + states + ", district="
				+ district + ", cep=" + cep + ", complement=" + complement +"]";
	}
	
}
