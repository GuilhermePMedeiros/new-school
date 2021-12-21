package br.com.newschool.core.base;

import java.io.Serializable;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 07/12/2021
 * */

public class ObjectBase implements Serializable, Cloneable {
	
	// Serial ID
	private static final long serialVersionUID = -6064377065615869946L;
	
	// Attributes
	private int id;
	
	// Builds 
	public ObjectBase() {
		
	}
	
	public ObjectBase(int id) {
		this.id = id;
	}

	// Gets and Sets
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Override of the toSting method 
	@Override
	public String toString() {
		return "id: " + id;
	}
	
	// Clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
