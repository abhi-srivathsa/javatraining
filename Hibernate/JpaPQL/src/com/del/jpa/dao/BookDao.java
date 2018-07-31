package com.del.jpa.dao;

import java.util.List;

import com.del.jpa.entity.Book;

public interface BookDao {

	boolean addBook(Book bk);

	void close();

	Book getBookByID(int id);

	List<Book> getBookByTitle(String title);

	List<Book> getBookByAuthor(String author);

	List<Book> getBookByRange(double min, double max);

	List<Book> getAllBooks();

	Long getTotalNoOfBooks();

	

}
