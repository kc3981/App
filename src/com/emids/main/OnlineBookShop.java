package com.emids.main;

import java.util.Scanner;

import com.emids.services.Inventory;
import com.emids.services.Product;

public class OnlineBookShop {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		System.out.println("press 1 to bookname");
		System.out.println("press 2 to book author");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		inventory.searchByBookAuthor("herbit schidt");
		inventory.searchByBookName("basics of java");
		Product product = new Product();
		System.out.println("press 1 to add new product");
		System.out.println("press 2 to edit the existing product");
		System.out.println("press 3 to view details of product");
		System.out.println("press 4 to view list");
		Scanner scanner2 = new Scanner(System.in);
		int number2 = scanner.nextInt();
		product.addNewProduct();
		product.editExistingProduct();
		product.viewDetailsofproduct();
		product.list();

	}

}
