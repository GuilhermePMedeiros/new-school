package br.com.newschool.core.base.service;

import java.util.List;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 07/12/2021
 * */

public interface ObjectServiceBase<T> {

	// Add Object Method
	public void addObject(T t);

	// Find Object Method by id
	public T findObjectById(int id);

	// Update Object Method by id
	public void UpdateObjectById(int id, T t);

	// Remove Object Method by id
	public void removeObjectById(int id);

	// Remove all Objects Method by ids with Objects List
	public abstract void removeAllObjectsById(List<T> t);

	// Remove all Objects Method by ids with Id's List
	public abstract void removeAllObjectsById(int[] ids);
}
