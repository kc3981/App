package com.emids.domain;

public class Book {
	String name;
	int id;
	double price;
	String BookAuthor;

	public Book(String name, int id, double price, String BookAuthor) {

		this.name = name;
		this.id = id;
		this.price = price;
		this.BookAuthor = BookAuthor;
	}

	public String getBookAuthor() {
		return BookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {

		return "bookname" + "bookid" + "bookprice" + "bookpublisher";
	}

}
