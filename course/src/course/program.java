package course;

import java.util.Scanner;

import entities.triangle;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		triangle x,y;
		x = new triangle();
		y = new triangle();
		
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("triangle X %.4f%n",areaX);
		System.out.printf("triangle Y %.4f%n",areaY);
		
		if(areaX>areaY) {
			System.out.println("area X é maior");
		}else {
			System.out.println("area Y é maior");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
