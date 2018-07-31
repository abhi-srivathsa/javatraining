package com.del.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.javafx.beans.IDProperty;

@Entity
@Table(name = "sub_hib")
public class Subject {
	@Id
	private String subjectid;
	private String name;
	private String description;

	public String getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Subject [subjectid=" + subjectid + ", name=" + name + ", description=" + description + "]";
	}

	public Subject(String subjectid, String name, String description) {
		super();
		this.subjectid = subjectid;
		this.name = name;
		this.description = description;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
}
