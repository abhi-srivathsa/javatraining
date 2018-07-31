package com.del.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeMain {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("empentity");
	EntityManager em = emf.createEntityManager();
	Address adr = new Address("A2109", "Paratha" , "chochon");
	Employee emp = new Employee("Pushkarsh" , 903028L, adr);
	em.getTransaction().begin();
	em.persist(emp);
	em.getTransaction().commit();
	System.out.println("Employee saved");
	
}
}
