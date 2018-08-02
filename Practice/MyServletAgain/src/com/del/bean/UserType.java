package com.del.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="type_details")
public class UserType {
	@Id
String type;

public UserType(String type) {
	super();
	this.type = type;
}

@Override
public String toString() {
	return "UserType [type=" + type + "]";
}

public UserType() {
	super();
	// TODO Auto-generated constructor stub
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
} 
}
