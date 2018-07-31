package com.del.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudSubMain {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentity");
		EntityManager em = emf.createEntityManager();
		// take stud id from user and fetch the data via jpa
		Scanner scan = new Scanner(System.in);
		//em.getTransaction().begin();
		System.out.println("Enter Student ID");
		String id = scan.next();
		Student st  = em.find(Student.class, id);
		System.out.println(st);
		//em.getTransaction().commit();
		
	}
}
