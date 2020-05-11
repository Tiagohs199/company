package arrays;

import java.util.Scanner;

public class exVetor {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		
		System.out.print("Digite um numero: ");
		int n = sc.nextInt();
		double[]vect = new double[n];
		
		
		for(int i=0;n>i;i++) {
			
			vect[i]= sc.nextDouble();
		
		}
		for(int i=0;n>i;i++) {
		System.out.println("Os numeros digitados: "+ vect[i]);
		}
		
		sc.close();
	}

}
