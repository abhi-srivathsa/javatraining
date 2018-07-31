package com.del.jpa.service;

import java.util.List;

import com.del.jpa.dao.BookDao;
import com.del.jpa.dao.BookDaoImpl;
import com.del.jpa.entity.Book;

public class BookServiceImpl implements BookService {
	private BookDao bDao;

	public BookServiceImpl() {
		bDao = new BookDaoImpl();
	}

	@Override
	public boolean addBook(Book bk) {
		return bDao.addBook(bk);
	}

	@Override
	public void close() {
		bDao.close();
		
	}

	@Override
	public Book getBookID(int id) {
	
		return bDao.getBookByID(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
	
		return bDao.getBookByTitle(title);
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
	return bDao.getBookByAuthor(author);
	}

	@Override
	public List<Book> getBookByRange(double min, double max) {
	return bDao.getBookByRange(min,max);
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bDao.getAllBooks();
	}

	@Override
	public Long getTotalNoOfBooks() {
			return bDao.getTotalNoOfBooks();
	}

}
