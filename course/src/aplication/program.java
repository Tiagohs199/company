package aplication;

import java.util.Locale;

import java.util.Scanner;

import entities.Product;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("price: ");
		Double price = sc.nextDouble();
		
		
		Product product = new Product(name,price);
		
	product.setName("computer");
		System.out.println("Update product name: "+ product.getName());
		
		
		System.out.println();
		System.out.println("Product data "+product);
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Product data "+product);
		
	
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts (quantity);
		
		System.out.println();
		System.out.println("Porduct data"+product);
		
	}

}
