package com.emids.domain;

import java.util.Scanner;

public class OnlineBookShop {
	void findbooks() {

	}

	public static void main(String[] args) {
		Product product = new Product();
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		product.addNewProduct();
		product.editExistingProduct();
		product.viewDetailsofproduct();
		product.list();
	}

}
