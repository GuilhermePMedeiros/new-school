package br.com.newschool.course.model;

import javax.persistence.Entity;

import br.com.newschool.core.base.model.ObjectBase;

@Entity
public class Course extends ObjectBase {

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 2603932134645819137L;

	// Attributes
	private String name;
	private float studyLoad;

	// Builders
	public Course() {
		super();
	}
	
	public Course(int id, String name,  float studyLoad) {
		super(id);
		this.name = name;
		this.studyLoad = studyLoad;
	}
	
	// Gets and Sets
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getStudyLoad() {
		return studyLoad;
	}

	public void setStudyLoad(float studyLoad) {
		this.studyLoad = studyLoad;
	}

	//TODO: ToString
	@Override
	public String toString() {
		return "Course [name=" + name + ", StudyLoad=" + studyLoad + "]";
	}
	
}
