package com.emids.services;

import java.util.Scanner;

public class Inventory {
	Scanner scanner = new Scanner(System.in);

	public void searchByBookName(String name) {
		System.out.println("enter the book ");
		String bookname = scanner.next();
		if (bookname.equalsIgnoreCase(name)) {
			System.out.println("the book name is present");

		} else
			System.out.println("the bookname  is not displayed");

	}

	public void searchByBookAuthor(String bookAuthor) {
		System.out.println("enter the author name");
		String bookauthor = scanner.next();
		if (bookauthor.equalsIgnoreCase(bookauthor)) {
			System.out.println("the book author is present");

		} else {
			System.out.println("the book author is displayed");
		}

	}

}
