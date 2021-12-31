package br.com.newschool.employee.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

import br.com.newschool.address.Address;
import br.com.newschool.core.utils.view.message.MessageHelper;
import br.com.newschool.employee.employeeslist.EmployeesList;
import br.com.newschool.employee.model.Employee;
import br.com.newschool.employee.service.EmployeeService;

@ManagedBean
@ViewScoped
public class EmployeeBean implements Serializable{

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 8362133978753109416L;

		// Attributes
		private EmployeesList employeesList;
		private Employee selectedCurrentEmployee;
		private List<Employee> selectedEmployeesList;
		private EmployeeService service;

		// Post Construct
		@PostConstruct
		public void init() {
			service = new EmployeeService();
			employeesList = new EmployeesList();
			employeesList.setObjectsList(service.getEmployeesList());
		}

		// Gets and Sets
		public EmployeesList getEmployeesList() {
			return employeesList;
		}

		public void setEmployeesList(EmployeesList employeesList) {
			this.employeesList = employeesList;
		}

		public Employee getSelectedCurrentEmployee() {
			return selectedCurrentEmployee;
		}

		public void setSelectedCurrentEmployee(Employee selectedCurrentEmployee) {
			this.selectedCurrentEmployee = selectedCurrentEmployee;
		}

		public List<Employee> getSelectedEmployeesList() {
			return selectedEmployeesList;
		}

		public void setSelectedEmployeesList(List<Employee> selectedEmployeesList) {
			this.selectedEmployeesList = selectedEmployeesList;
		}

		// Get delete button message
		public String getdeleteButtonMessage() {
			if (hasSelectedEmployeesList()) {
				return selectedEmployeesList.size() > 1 ? selectedEmployeesList.size() + " funcionários(as) selecionados"
						: selectedEmployeesList.size() + " funcionário(a) selecionado(a)";
			}
			return "Apagar";
		}

		// Method to create new Employee object
		public void openNewEmployee() {
			this.selectedCurrentEmployee = new Employee();
			selectedCurrentEmployee.setAddress(new Address());
		}

		// Method to save or edit Employee
		public void saveEmployee() {

			// If id equals 0 it's the new Employee, but id > 0 it's exist Employee
			if (this.selectedCurrentEmployee.getId() == 0) {
				this.employeesList.addObject(this.selectedCurrentEmployee);
				this.service.addObject(this.selectedCurrentEmployee);
				// Setting message to success add.
				MessageHelper.addInfoMessage("Funcionário(a) adicionado com sucesso!");
			} else {
				this.employeesList.UpdateObjectById(selectedCurrentEmployee.getId(), selectedCurrentEmployee);
				this.service.UpdateObjectById(selectedCurrentEmployee.getId(), selectedCurrentEmployee);
				// Setting message to success edit.
				MessageHelper.addInfoMessage("Funcionário(a) alterado com sucesso!");
			}
			//
			this.selectedCurrentEmployee = null;
			// Updating form
			PrimeFaces.current().executeScript("PF('manageEmployeeDialog').hide()");
			PrimeFaces.current().ajax().update("form:messages", "form:dt-employees");
		}

		// Delete or remove the selected current Employee
		public void deleteEmployee() {
			// Removing Objects of the lists
			this.employeesList.removeObjectById(selectedCurrentEmployee.getId());
			this.service.removeObjectById(this.selectedCurrentEmployee.getId());
			// Setting Current Employee to null
			this.selectedCurrentEmployee = null;
			// Setting message to success remove Employee
			MessageHelper.addInfoMessage("Funcionário(a) removido com sucesso!");
			// Updating form
			PrimeFaces.current().ajax().update("form:messages", "form:dt-employees");
		}

		// Method to return the boolean value if SelectedEmployeesList has selected
		public boolean hasSelectedEmployeesList() {
			return this.selectedEmployeesList != null && !this.selectedEmployeesList.isEmpty();
		}

		// Method to delete Selected Employees List
		public void deleteSelectedEmployeesList() {
			// Removing
			this.employeesList.removeAllObjectsById(selectedEmployeesList);
			this.service.removeAllObjectsById(selectedEmployeesList);
			// Setting message to success remove Employees
			String summary = selectedEmployeesList.size() > 1
					? selectedEmployeesList.size() + " Funcionários(as) removidos com sucesso!"
					: selectedEmployeesList.size() + " Funcionário(a) removido com sucesso!";
			MessageHelper.addInfoMessage(summary);
			// Setting selected Employees list to null
			this.selectedEmployeesList = null;
			// Updating form
			PrimeFaces.current().ajax().update("form:messages", "form:dt-employees");
			PrimeFaces.current().executeScript("PF('dtEmployees').clearFilters()");
		}
	
}
