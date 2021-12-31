package br.com.newschool.user.view;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.newschool.core.utils.view.communication.initparameter.InitParameterHelper;
import br.com.newschool.user.model.User;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

	// Serial Id
	private static final long serialVersionUID = -5331751306145829727L;

	// Attributes
	private String name;
	private String password;
	private User user;

	// Get and set
	public User getUser() {
		return user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// Return Image Logo Path
	public String getImageLogo() {
		return InitParameterHelper.getInitParameterHelper("logo.location");
	}

	// Login Method TODO
	public String login() {
		//
		if (name.equals("adm") && password.equals("123")) {
			user = new User();
			return "home";
		}
		//
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "login e/ou senha invalidos", ""));
		//
		return null;
	}

	// Logout Method
	public String logout() {
		// Delete session object
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "login";
	}

}
