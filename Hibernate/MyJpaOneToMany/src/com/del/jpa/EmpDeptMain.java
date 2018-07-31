package com.del.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpDeptMain {
public static void main(String[] args) {
	EntityManagerFactory empf=Persistence.createEntityManagerFactory("empentity");
	EntityManager em = empf.createEntityManager();
	Set<Employee> empSet = new HashSet<>();
	Department dep = new Department(1236,"Development1", empSet);
	Employee e1 = new Employee(1316,"Piyush","Developer", dep);
	Employee e2 = new Employee(1317,"Toby","Engineer", dep);
	Employee e3 = new Employee(1318,"Harsh","Team lead", dep);
	Employee e4 = new Employee(1319,"Debarati","CEO", dep);
	empSet .add(e1);
	empSet .add(e2);
	empSet .add(e3);
	empSet .add(e4);
	System.out.println(dep);
	em.getTransaction().begin();
	em.persist(dep);
	em.getTransaction().commit();
	System.out.println("Department saved");
	
	

}
}
