package br.com.newschool.core.base;

import java.util.List;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 03/12/2021
 * */

public interface ObjectBeanBase<T> {

	// Get Method to Objects List
	public List<T> getObjectList();
	// Add Method to Object
	public String addObject();
	// Find Method to Object by id
	public void findObjectById();
	// Update Method Object by id 
	public String UpdateObjectById();
	// Remove Method To Object
	public String removeObjectById();
	
}
