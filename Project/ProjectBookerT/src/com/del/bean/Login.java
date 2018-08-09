package com.del.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_hib")
public class Login {
	@Id
	private String login;
	private String password;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
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
	@Override
	public String toString() {
		return "Login [login=" + login + ", password=" + password + "]";
	}
	
	
}
