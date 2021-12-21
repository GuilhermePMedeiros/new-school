package br.com.newschool.core.base;

import java.util.List;

public abstract class ObjectDaoBase<T> {

	// Get ObjectList
	public abstract List<T> getObjectsList();

	// Get Cloned Object List
	public abstract List<T> getClonedObjectList();

	// Add Object Method
	public abstract void addObject(T t);

	// Find Object Method by id
	public abstract T findObjectById(int id);

	// Update Object Method by id
	public abstract void UpdateObjectById(int id, T t);

	// Remove Object Method by id
	public abstract void removeObjectById(int id);

	// Remove all Objects Method by ids with Objects List
	public abstract void removeAllObjectsById(List<T> t);

	// Remove all Objects Method by ids with Id's List
	public abstract void removeAllObjectsById(int[] ids);

}
