package br.com.newschool.user.model;

import br.com.newschool.core.base.ObjectBase;

public class User extends ObjectBase {
	
	// Serial id
	private static final long serialVersionUID = 7528899548098614026L;

	// Attributes
	private String login;
	private String password;
	
	public User() {
		super();
	}
	
	public User(int id, String login, String password) {
		super(id);
		this.login = login;
		this.password = password;
	}

	//gets and sets
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	
}
