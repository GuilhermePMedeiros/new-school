package br.com.newschool.employee.service;

import java.util.List;

import br.com.newschool.core.base.service.ObjectServiceBase;
import br.com.newschool.employee.dao.EmployeeDao;
import br.com.newschool.employee.model.Employee;


/**
 * @author guilherme.pacheco
 * @version 2.0 
 * Date: 20/12/2021
 */

public class EmployeeService implements ObjectServiceBase<Employee>{
	
	// Attributes
	private EmployeeDao employeeDao;
	
	public EmployeeService() {
		employeeDao = EmployeeDao.getInstance();
	}
	
	// Gets EmployeeList
	public List<Employee> getEmployeesList(){
		return employeeDao.getClonedObjectList();
	}
	
	// Override Methods
	@Override
	public void addObject(Employee employee) {
		employeeDao.addObject(employee);
	}

	@Override
	public Employee findObjectById(int id) {
		return employeeDao.findObjectById(id);
	}

	@Override
	public void UpdateObjectById(int id, Employee employee) {
		employeeDao.UpdateObjectById(id, employee);
	}

	@Override
	public void removeObjectById(int id) {
		employeeDao.removeObjectById(id);
	}

	@Override
	public void removeAllObjectsById(List<Employee> employees) {
		employeeDao.removeAllObjectsById(employees);
	}

	@Override
	public void removeAllObjectsById(int[] ids) {
		employeeDao.removeAllObjectsById(ids);
	}

}
