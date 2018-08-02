package com.del.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class User {
	
	private String name;
	@Id
	private String login;
	private String password;
	private String type;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String login, String password) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
	}
	public User(String name, String login, String password, String type) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
		this.type = type;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", login=" + login + ", password=***" + ", type=" + type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	
	
	
}
