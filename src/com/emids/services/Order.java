package com.emids.services;

import java.util.ArrayList;
import java.util.List;

import com.emids.domain.Book;

public class Order {
	List<Book> bookorder = new ArrayList<>();

	void addneworder() {
		List<Book> bookOrder = new ArrayList<>();
		bookorder.add(new Book("basics of Java", 2080, 250, "Herbit schidt"));
		bookorder.add(new Book("basics of python", 2080, 350, "aditya"));
		bookorder.add(new Book("basics of os", 2080, 350, "james mathew"));
	}

	void editexistingorder() {
		Book order = new Book("basics of java1", 2080, 250, "herbitSchidt");
		order.setPrice(200);
		System.out.println(order.getPrice());
	}

	void viewDetailsOfOrder() {
		List<Book> orderlist = new ArrayList<>();
		System.out.println("if you want java book then press1/n");
		orderlist.add(new Book("basics of java2", 2080, 250, "Herbit schidt"));
		System.out.println("if you want python book then press2/n ");
		orderlist.add(new Book("basics of python", 2080, 350, "aditya"));
		System.out.println("if you want os book then press 3/n ");
		orderlist.add(new Book("basics of os", 2080, 350, "james mathew"));

		for (Book b : orderlist) {
			System.out.println(b);
		}
	}

	@Override
	public String toString() {
		return "Order [bookorder=" + bookorder + "]";
	}

	void listOfAllOrder() {
		System.out.println(bookorder);
	}
}
