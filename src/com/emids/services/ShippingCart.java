package com.emids.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.emids.domain.Book;

public class ShippingCart {
	Scanner scanner = new Scanner(System.in);
	List<Book> booklist = new ArrayList<>();

	void addtoCart(Book book) {

		booklist.add(book);

	}

}
