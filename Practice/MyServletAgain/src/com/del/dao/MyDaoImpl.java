package com.del.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.del.bean.User;
import com.del.bean.UserType;

import com.del.util.JPAUtil;

public class MyDaoImpl implements MyDao {

	@Override
	public String gettype(User usr) {
		String type = null;
		EntityManager em = JPAUtil.getEntityManager();
		User user = em.find(User.class, usr.getLogin());
		System.out.println("user: " + user);
		if (user != null && user.getPassword().equals(usr.getPassword()))
			type = user.gettype();
		// usr.settype(user.gettype());
		return type;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> userList = null;
		EntityManager em = JPAUtil.getEntityManager();
		String qry = "select usr from User usr";
		TypedQuery<User> query = em.createQuery(qry, User.class);

		userList = query.getResultList();

		return userList;
	}

	@Override
	public List<UserType> getAllTypes() {
		List<UserType> typeList = null;
		EntityManager em = JPAUtil.getEntityManager();
		String qry = "select usrt from UserType usrt";
		TypedQuery<UserType> query = em.createQuery(qry, UserType.class);

		typeList = query.getResultList();

		return typeList;
	}

	@Override
	public boolean register(User usr2) {
		boolean res = false;
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(usr2);
		em.getTransaction().commit();
		em.detach(usr2);
		res = true;
		return res;
	}

	@Override
	public boolean checklogin(String loginVal) {
		boolean check = false;
		try {
			EntityManager em = JPAUtil.getEntityManager();
			User usr = em.find(User.class, loginVal);
			if(usr != null)
				check = true;
			// String qry = "select usr from User usr where usr.login = :plogin";
			// TypedQuery<User> query = em.createQuery(qry, User.class);
			// query.setParameter("plogin", loginExist);
			// User u = query.getSingleResult();
		} catch (Exception e) {
			
		}

		return check;
	}

}
