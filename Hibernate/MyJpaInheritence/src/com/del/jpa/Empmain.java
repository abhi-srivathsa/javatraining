package com.del.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Empmain {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("empentity");
	EntityManager em = emf.createEntityManager();
	Employee emp=new Employee( "Ashwani",9012389193L);
	Manager mgr = new Manager( "sudeep", 903108193L);
	mgr.setDept("Marketing");
	em.getTransaction().begin();
	em.persist(emp);
	em.persist(mgr);
	em.getTransaction().commit();
	System.out.println("Entities saved");
	
}
}
