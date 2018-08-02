package com.del.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManager em;
	/*
	 * JPA EntityManager is used to access a database in a particular application.
	 * It is used to manage persistent entity instances, to find entities by their
	 * primary key identity, and to query over all entities
	 */

	public static EntityManager getEntityManager() {
		if (em == null || !em.isOpen()) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("userentity");
			/*
			 * The EntityManagerFactory instance, when constructed, opens the database. If
			 * the database does not yet exist a new database file is created.
			 */
			em = emf.createEntityManager();
		}
		return em;
	}

	public static void closeEntityManager() {
		em.close();
	}
}
