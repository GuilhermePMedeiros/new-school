package br.com.newschool.core.base.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author guilherme.pacheco
 * @version 2.0
 * Date: 28/12/2021
 * */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ObjectBase implements Serializable, Cloneable {
	
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = -6064377065615869946L;
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
