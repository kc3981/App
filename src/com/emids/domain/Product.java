package com.emids.domain;

import java.util.ArrayList;
import java.util.List;

public class Product {


	

	List<Book> booklist = new ArrayList<>();

	void addNewProduct() {
		List<Book> booklist = new ArrayList<>();
		booklist.add(new Book("basics of java", 2080, 250, "Herbit schidt"));
		booklist.add(new Book("basics of python", 2080, 350, "aditya"));
		booklist.add(new Book("basics of os", 2080, 350, "james mathew"));

	}

	void editExistingProduct() {
		Book book = new Book("basics of java", 2080, 250, "herbitSchidt");
		book.setPrice(200);
		System.out.println(book.getPrice());
	}

	void viewDetailsofproduct() {
		List<Book> booklist = new ArrayList<>();
		booklist.add(new Book("basics of java", 2080, 250, "Herbit schidt"));
		booklist.add(new Book("basics of python", 2080, 350, "aditya"));
		booklist.add(new Book("basics of os", 2080, 350, "james mathew"));

		for (Book b : booklist) {
			System.out.println(b);

		}
	}

	void list() {
		System.out.println(booklist);

	}

	@Override
	public String toString() {
		return "Product [booklist=" + booklist + "]";
	}

}
