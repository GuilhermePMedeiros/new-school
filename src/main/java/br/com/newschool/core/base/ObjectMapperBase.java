package br.com.newschool.core.base;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 03/12/2021
 * */

public interface ObjectMapperBase <T> {

	// Add Object Method
	public void addObject(T t);
	// Find Object Method by id 
	public T findObjectById(long id);
	// Update Object Method by id
	public void UpdateObjectById(long id, T t);
	// Remove Object Method by id
	public void removeObjectById(long id);
	
}
