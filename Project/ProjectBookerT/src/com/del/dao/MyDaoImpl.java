package com.del.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.del.bean.Login;

public class MyDaoImpl implements MyDao{

	@Override
	public boolean checklogin(Login login) {
		boolean success = false;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("custentity");
		EntityManager em = emf.createEntityManager();
		Login l = em.find(Login.class, login.getLogin());
		if(l!=null&&l.getPassword()==login.getPassword())
			success = true;
		return success;
	}

}
