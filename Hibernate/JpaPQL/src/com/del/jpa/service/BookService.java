package com.del.jpa.service;

import java.util.List;

import com.del.jpa.entity.Book;

public interface BookService {

	boolean addBook(Book bk);

	void close();

	Book getBookID(int id);

	List<Book> getBookByTitle(String title);

	List<Book> getBookByAuthor(String author);

	List<Book> getBookByRange(double min, double max);

	List<Book> getAllBooks();

	Long getTotalNoOfBooks();

}
