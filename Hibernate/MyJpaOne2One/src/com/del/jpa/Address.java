package com.del.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addr_hib")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String houseno;
	private String Street;
	private String town;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", houseno=" + houseno + ", Street=" + Street + ", town=" + town + "]";
	}

	public String getHouseno() {
		return houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	public Address(int id, String houseno, String street, String town) {
		super();
		this.id = id;
		this.houseno = houseno;
		this.Street = street;
		this.town = town;
	}

	public Address(String houseno, String street, String town) {

		this.houseno = houseno;
		this.Street = street;
		this.town = town;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
