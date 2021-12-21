package br.com.newschool.student.studentslist;

import java.util.ArrayList;
import java.util.List;

import br.com.newschool.core.base.ObjectsListBase;
import br.com.newschool.student.model.Student;

/**
 * @author guilherme.pacheco
 * @version 2.0 
 * Date: 20/12/2021
 */

public class StudentsList extends ObjectsListBase<Student> {

	// Serial id
	private static final long serialVersionUID = 1627662764128867811L;

	// Builds
	public StudentsList() {
		super();
	}

	public StudentsList(List<Student> studentsList) {
		super(studentsList);
	}

	// Get Cloned Objects List
	public List<Student> getClonedObjectsList() {

		try {
			List<Student> clonedStudentList = new ArrayList<Student>();
			if (getObjectsList().size() > 0) {
				for (Student originalObject : getObjectsList()) {
					//
					Student clonedObject = originalObject.clone();

					clonedStudentList.add(clonedObject);
				}
			}
			return clonedStudentList;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// Overrides Methods
	@Override
	public void addObject(Student student) {
		student.setId(getObjectsList().size() + 1);
		getObjectsList().add(student);
	}

	@Override
	public Student findObjectById(int id) {
		try {
			for (Student student : getObjectsList()) {
				if (student.getId() == id) {
					return student;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void UpdateObjectById(int id, Student student) {
		try {
			for (Student it : getObjectsList()) {
				if (it.getId() == student.getId()) {
					it = student;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeObjectById(int id) {
		try {
			getObjectsList().remove(findObjectById(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeAllObjectsById(List<Student> students) {
		try {
			for (Student student : students) {
				removeObjectById(student.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void removeAllObjectsById(int[] ids) {
		try {
			for (int id : ids) {
				removeObjectById(id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
