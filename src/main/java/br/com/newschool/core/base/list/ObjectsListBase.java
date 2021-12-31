package br.com.newschool.core.base.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author guilherme.pacheco
 * @version 2.0 
 * Date: 20/12/2021
 */

public abstract class ObjectsListBase<T> implements Serializable, Cloneable {

	// Serial id
	private static final long serialVersionUID = 2848904473101485351L;

	// Attributes
	private List<T> objectsList;

	// Builds
	public ObjectsListBase() {
		objectsList = new ArrayList<T>();
	}

	public ObjectsListBase(List<T> objectsList) {
		this.objectsList = objectsList;
	}

	// Gets and Sets
	public List<T> getObjectsList() {
		return objectsList;
	}

	public void setObjectsList(List<T> objectsList) {
		this.objectsList = objectsList;
	}

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

	// clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

//	// Clone List Method
//	public List<T> getClonedObjectsList(){
//		// 
//		List<T> clonedObjectsList = new ArrayList<T>();
//		//
//		for (T originalObject : getObjectsList()) {
//			//
//			T clonedObject = new T();
//			//
//			Field[] fields = originalObject.getClass().getDeclaredFields();
//			//
//			for (int i = 0; i < fields.length; i++) {
//				fields[i].setAccessible(true);
//				try {
//				    // for each class/suerclass, copy all fields
//					// from this object to the clone
//				    fields[i].set(clonedObject, fields[i].get(originalObject));
//				  }
//				  catch (IllegalArgumentException e){}
//				  catch (IllegalAccessException e) {}
//			}
//			//
//			clonedObjectsList.add(clonedObject);
//		}
//		//
//		return clonedObjectsList;
//	}

}
