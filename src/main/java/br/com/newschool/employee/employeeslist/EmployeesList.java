package br.com.newschool.employee.employeeslist;

import java.util.ArrayList;
import java.util.List;

import br.com.newschool.core.base.list.ObjectsListBase;
import br.com.newschool.employee.model.Employee;

public class EmployeesList extends ObjectsListBase<Employee> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = -4200780212410034965L;

	// Builds
	public EmployeesList() {
		super();
	}

	public EmployeesList(List<Employee> employeesList) {
		super(employeesList);
	}

	// Get Cloned Objects List
	public List<Employee> getClonedObjectsList() {

		try {
			List<Employee> clonedEmployeeList = new ArrayList<Employee>();
			if (getObjectsList().size() > 0) {
				for (Employee originalObject : getObjectsList()) {
					//
					Employee clonedObject = originalObject.clone();

					clonedEmployeeList.add(clonedObject);
				}
			}
			return clonedEmployeeList;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// Overrides Methods
	@Override
	public void addObject(Employee employee) {
		// Employee.setId(getObjectsList().size() + 1);
		getObjectsList().add(employee);
	}

	@Override
	public Employee findObjectById(int id) {
		try {
			for (Employee employee : getObjectsList()) {
				if (employee.getId() == id) {
					return employee;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void UpdateObjectById(int id, Employee employee) {
		try {
			for (Employee it : getObjectsList()) {
				if (it.getId() == employee.getId()) {
					it = employee;
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
	public void removeAllObjectsById(List<Employee> employees) {
		try {
			for (Employee employee : employees) {
				removeObjectById(employee.getId());
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
