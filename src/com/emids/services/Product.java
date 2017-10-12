package com.emids.services;

import java.util.ArrayList;
import java.util.List;

import com.emids.domain.Book;

public class Product {
	static List<Book> booklist = new ArrayList<>();

	public void addNewProduct() {
		List<Book> bookList = new ArrayList<>();
		booklist.add(new Book("Basics of java", 2080, 250, "Herbit schidt"));
		booklist.add(new Book("basics of python", 2080, 350, "aditya"));
		booklist.add(new Book("basics of os", 2080, 350, "james mathew"));

	}

	public void editExistingProduct() {
		Book book = new Book("basics of java", 2080, 250, "herbitSchidt");
		book.setPrice(200);
		System.out.println(book.getPrice());
	}

	public static List<Book> viewDetailsofproduct() {
		List<Book> bookList = new ArrayList<>();
		booklist.add(new Book("basics of java", 2080, 250, "Herbit schidt"));
		booklist.add(new Book("basics of python", 2080, 350, "aditya"));
		booklist.add(new Book("basics of os", 2080, 350, "james mathew"));

		for (Book b : booklist) {
			System.out.println(b);

		}
		return booklist;
	}

	public void list() {
		System.out.println(booklist);

	}

	@Override
	public String toString() {
		return "Product [booklist=" + booklist + "]";
	}

}
