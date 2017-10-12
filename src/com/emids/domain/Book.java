package com.emids.domain;

public class Book {
	private String name;
	private int id;
	private double price;
	private String bookAuthor;

	public Book(String name, int id, double price, String bookAuthor) {

		this.name = name;
		this.id = id;
		this.price = price;
		this.bookAuthor = bookAuthor;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		bookAuthor = bookAuthor;
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
