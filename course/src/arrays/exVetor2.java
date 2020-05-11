package arrays;

import java.util.Scanner;

public class exVetor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("type the number of the products: ");
		int n = sc.nextInt();
		Product[] vect =new Product[n];
		
		
		for(int i=0;vect.length>i;i++) {
			
			System.out.print("the name of the product: ");
			String name = sc.next();
			System.out.print("the price of the product: ");
			double price =sc.nextDouble();
			vect[i] = new Product(name,price);
			 
		}
		double soma =0;
		
		for(int i=0;vect.length>i;i++) {
		
			soma += vect[i].getPrice();
			
		}
		System.out.printf("a media é: %.2f%n",soma/vect.length);
		
		
		
		
		
		sc.close();
	}

}
