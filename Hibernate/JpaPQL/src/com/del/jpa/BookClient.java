package com.del.jpa;

import java.util.List;
import java.util.Scanner;

import com.del.jpa.entity.Book;
import com.del.jpa.service.BookService;
import com.del.jpa.service.BookServiceImpl;

public class BookClient {
	BookService bService;

	public BookClient() {
		bService = new BookServiceImpl();
		Scanner scan = new Scanner(System.in);
		while (true) {
			int choice = getChoice(scan);
			switch (choice) {
			case 1:
				System.out.println("1.Add a book");
				System.out.println("Enter ID,  Author,Title , Price");
				Book bk = new Book(scan.nextInt(),scan.next(),scan.next(), scan.nextDouble());
				boolean success = bService.addBook(bk);
				if (success) {
					System.out.println("book saved");
				}else {
					System.out.println("book not saved");
				}
				break;
			case 2:
				System.out.println("2.Fetch books by ID");
				System.out.println("Enter the id");
				int id = scan.nextInt();
				Book bk2 = bService.getBookID(id);
				if(bk2 != null) {
					System.out.println(bk2);
				}else {
					System.out.println("not found");
				}
				break;
			case 3:
				System.out.println("3.Fetch books by Title");
				System.out.println("Enter the title");
				String title = scan.next();
				List<Book> bk3 = bService.getBookByTitle(title);
				if(bk3 != null) {
					System.out.println(bk3);
				}else {
					System.out.println("not found");
				}
				break;
			case 4:
				System.out.println("4.Fetch books by Author");
				System.out.println("Enter the Author");
				String author = scan.next();
				List<Book> bk4 = bService.getBookByAuthor(author);
				if(bk4 != null) {
					System.out.println(bk4);
				}else {
					System.out.println("not found");
				}
				break;
			case 5:
				System.out.println("5.Fetch books in Price range");
				System.out.println("Enter the price range min");
				double min = scan.nextInt();
				System.out.println("Enter the price range max");
				double max = scan.nextInt();
				List<Book> bk5 = bService.getBookByRange(min,max);
				if(bk5 != null) {
					System.out.println(bk5);
				}else {
					System.out.println("not found");
				}
				break;
			case 6:
				System.out.println("6.Display all books");
				List<Book> bk6 = bService.getAllBooks();
				if(bk6!= null) {
					System.out.println(bk6);
				}else {
					System.out.println("not found");
				}
				break;
			case 7:
				System.out.println("7.Find Total number of books");
				Long count = bService.getTotalNoOfBooks();
				System.out.println("The total no of books are " + count);
				break;
			case 8:
				System.out.println("Exiting program .... Thank you");
				bService.close();
				System.exit(0);

				break;
			default:
				System.out.println("Choose from 1-8");
				break;
			}

		}
	}

	public static void main(String[] args) {
		new BookClient();
	}

	private static int getChoice(Scanner scan) {
		int choice = 0;
		System.out.println("1.Add a book");
		System.out.println("2.Fetch books by ID");
		System.out.println("3.Fetch books by Title");
		System.out.println("4.Fetch books by Author");
		System.out.println("5.Fetch books in Price range");
		System.out.println("6.Display all books");
		System.out.println("7.Find Total number of books");
		System.out.println("8.Quit program");
		System.out.println("enter choice 1-8");
		choice = scan.nextInt();
		return choice;
	}
}
