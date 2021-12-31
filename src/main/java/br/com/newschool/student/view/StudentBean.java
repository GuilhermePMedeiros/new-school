package br.com.newschool.student.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

import br.com.newschool.address.Address;
import br.com.newschool.core.utils.view.message.MessageHelper;
import br.com.newschool.student.model.Student;
import br.com.newschool.student.service.StudentService;
import br.com.newschool.student.studentslist.StudentsList;

/**
 * @author guilherme.pacheco
 * @version 3.0 Date: 20/12/2021
 */

@ManagedBean
@ViewScoped
public class StudentBean implements Serializable {

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = -3350955653156395340L;

	// Attributes
	private StudentsList studentsList;
	private Student selectedCurrentStudent;
	private List<Student> selectedStudentsList;
	private StudentService service;

	// Post Construct
	@PostConstruct
	public void init() {
		service = new StudentService();
		studentsList = new StudentsList();
		studentsList.setObjectsList(service.getStudentsList());
	}

	// Gets and Sets
	public StudentsList getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(StudentsList studentsList) {
		this.studentsList = studentsList;
	}

	public Student getSelectedCurrentStudent() {
		return selectedCurrentStudent;
	}

	public void setSelectedCurrentStudent(Student selectedCurrentStudent) {
		this.selectedCurrentStudent = selectedCurrentStudent;
	}

	public List<Student> getSelectedStudentsList() {
		return selectedStudentsList;
	}

	public void setSelectedStudentsList(List<Student> selectedStudentsList) {
		this.selectedStudentsList = selectedStudentsList;
	}

	// Get delete button message
	public String getdeleteButtonMessage() {
		if (hasSelectedStudentsList()) {
			return selectedStudentsList.size() > 1 ? selectedStudentsList.size() + " alunos selecionados"
					: selectedStudentsList.size() + " aluno selecionado";
		}
		return "Apagar";
	}

	// Method to create new Student object
	public void openNewStudent() {
		this.selectedCurrentStudent = new Student();
		selectedCurrentStudent.setAddress(new Address());
	}

	// Method to save or edit Student
	public void saveStudent() {

		// If id equals 0 it's the new Student, but id > 0 it's exist student
		if (this.selectedCurrentStudent.getId() == 0) {
			this.studentsList.addObject(this.selectedCurrentStudent);
			this.service.addObject(this.selectedCurrentStudent);
			// Setting message to success add.
			MessageHelper.addInfoMessage("Aluno adicionado com sucesso!");
		} else {
			this.studentsList.UpdateObjectById(selectedCurrentStudent.getId(), selectedCurrentStudent);
			this.service.UpdateObjectById(selectedCurrentStudent.getId(), selectedCurrentStudent);
			// Setting message to success edit.
			MessageHelper.addInfoMessage("Aluno alterado com sucesso!");
		}
		//
		this.selectedCurrentStudent = null;
		// Updating form
		PrimeFaces.current().executeScript("PF('manageStudentDialog').hide()");
		PrimeFaces.current().ajax().update("form:messages", "form:dt-students");
	}

	// Delete or remove the selected current Student
	public void deleteStudent() {
		// Removing Objects of the lists
		this.studentsList.removeObjectById(selectedCurrentStudent.getId());
		this.service.removeObjectById(this.selectedCurrentStudent.getId());
		// Setting Current Student to null
		this.selectedCurrentStudent = null;
		// Setting message to success remove student
		MessageHelper.addInfoMessage("Aluno removido com sucesso!");
		// Updating form
		PrimeFaces.current().ajax().update("form:messages", "form:dt-students");
	}

	// Method to return the boolean value if SelectedStudentsList has selected
	public boolean hasSelectedStudentsList() {
		return this.selectedStudentsList != null && !this.selectedStudentsList.isEmpty();
	}

	// Method to delete Selected Students List
	public void deleteSelectedStudentsList() {
		// Removing
		this.studentsList.removeAllObjectsById(selectedStudentsList);
		this.service.removeAllObjectsById(selectedStudentsList);
		// Setting message to success remove students
		String summary = selectedStudentsList.size() > 1
				? selectedStudentsList.size() + " alunos removidos com sucesso!"
				: selectedStudentsList.size() + " aluno removido com sucesso!";
		MessageHelper.addInfoMessage(summary);
		// Setting selected Students list to null
		this.selectedStudentsList = null;
		// Updating form
		PrimeFaces.current().ajax().update("form:messages", "form:dt-students");
		PrimeFaces.current().executeScript("PF('dtProducts').clearFilters()");
	}

}
