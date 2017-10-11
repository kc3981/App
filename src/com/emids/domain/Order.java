package com.emids.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	List<Book> bookorder = new ArrayList<>();

	void addneworder() {
		List<Book> bookorder = new ArrayList<>();
		bookorder.add(new Book("basics of java", 2080, 250, "Herbit schidt"));
		bookorder.add(new Book("basics of python", 2080, 350, "aditya"));
		bookorder.add(new Book("basics of os", 2080, 350, "james mathew"));
	}

	void editexistingorder() {
		Book order = new Book("basics of java", 2080, 250, "herbitSchidt");
		order.setPrice(200);
		System.out.println(order.getPrice());
	}

	void viewDetailsOfOrder() {

		List<Book> orderlist = new ArrayList<>();
		orderlist.add(new Book("basics of java", 2080, 250, "Herbit schidt"));
		orderlist.add(new Book("basics of python", 2080, 350, "aditya"));
		orderlist.add(new Book("basics of os", 2080, 350, "james mathew"));

		for (Book b : orderlist) {
			System.out.println(b);
		}

	}

	@Override
	public String toString() {
		return "Order [bookorder=" + bookorder + "]";
	}

	void ListOfallOrder() {
		System.out.println(bookorder);
	}

}
