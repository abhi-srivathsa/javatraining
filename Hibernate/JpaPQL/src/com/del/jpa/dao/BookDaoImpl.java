package com.del.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.del.jpa.entity.Book;
import com.del.jpa.util.JPAUtil;

public class BookDaoImpl implements BookDao {

	@Override
	public boolean addBook(Book bk) {
		boolean success = false;
		try {
			EntityManager em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(bk);
			em.getTransaction().commit();
			success = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public void close() {
		JPAUtil.closeEntityManager();
	}

	@Override
	public Book getBookByID(int id) {
		EntityManager em = JPAUtil.getEntityManager();
		return em.find(Book.class, id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		EntityManager em = JPAUtil.getEntityManager();
		List<Book> booklist = null;
		String qry = "select bk from Book bk where bk.title = :pTitle";
		TypedQuery<Book> query = em.createQuery(qry, Book.class);
		query.setParameter("pTitle", title);
		 booklist = query.getResultList();
		 return booklist;
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
	EntityManager em = JPAUtil.getEntityManager();
	List<Book> booklist = null;
	String qry = "select bk from Book bk where bk.author=:pAuthor";
	TypedQuery<Book> query = em.createQuery(qry, Book.class);
	query.setParameter("pAuthor", author);
	booklist = query.getResultList();
	return booklist;
	}

	@Override
	public List<Book> getBookByRange(double min, double max) {
		EntityManager em = JPAUtil.getEntityManager();
		List<Book> booklist = null;
		String qry = "select bk from Book bk where bk.price between :pmin and :pmax";
		TypedQuery<Book> query = em.createQuery(qry, Book.class);
		query.setParameter("pmin", min);
		query.setParameter("pmax", max);
		booklist = query.getResultList();
		return booklist;
	}

	@Override
	public List<Book> getAllBooks() {
		EntityManager em = JPAUtil.getEntityManager();
		List<Book> booklist = null;
		String qry = "select bk from Book bk ";
		TypedQuery<Book> query = em.createQuery(qry, Book.class);
		booklist = query.getResultList();
		return booklist;
	}

	@Override
	public Long getTotalNoOfBooks() {
		EntityManager em = JPAUtil.getEntityManager();
		Long count = 0L;
		String qry = "select count(bk.id) from Book bk ";
		TypedQuery<Long> query = em.createQuery(qry, Long.class);
		count = query.getSingleResult();
		return count;
	}

}
