package br.com.newschool.core.base;

import java.io.Serializable;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 07/12/2021
 * */

public class ObjectBase implements Serializable {
	
	// Serial ID
	private static final long serialVersionUID = -6064377065615869946L;
	
	// Attributes
	private long id;
	
	// Builds 
	public ObjectBase() {
		
	}
	
	public ObjectBase(long id) {
		this.id = id;
	}

	// Gets and Sets
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	// Override of the toSting method 
	@Override
	public String toString() {
		return "ObjectBase [id=" + id + "]";
	}
	
}
