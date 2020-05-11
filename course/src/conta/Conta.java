package conta;

import java.util.Scanner;

import dadosConta.DadosConta;

public class Conta {

	public static void main(String[] args) {
		DadosConta dadosConta;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		System.out.print("Enter account Holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there a inicial deposit? ");
		char awser = sc.next().charAt(0);
	
		dadosConta = new DadosConta(account, name);
		
		if(awser == 'y') {
			System.out.print("Enter Inicial deposit value: ");
			double deposit = sc.nextDouble();
			dadosConta.Add(deposit);
			}
		
		
		
		System.out.println("Dados: "+ dadosConta);
		System.out.print("Enter a deposit value: ");
		double add = sc.nextDouble();
		dadosConta.Add(add);
		
		System.out.println();
		System.out.println("Update account data:");
		System.out.println(dadosConta);
		
		System.out.print("Enter a withdraw value: ");
		double sub = sc.nextDouble();
		dadosConta.subtract(sub);
		System.out.println();
		System.out.println("Update account data:");
		System.out.println(dadosConta);
				
	
		
		
		sc.close();
	
	}
	

}
