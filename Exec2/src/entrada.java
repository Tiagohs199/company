import java.util.Scanner;

public class entrada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		funcionario func = new funcionario();
		
		System.out.print("Name: ");
		func.name = sc.next();
		System.out.print("Gross Salary: ");
		func.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		
		System.out.println("Employee: "+func);
		
		System.out.print("which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		func.IncreaseSalary(percentage);
		
		System.out.println("update data: "+func);

	}

}
