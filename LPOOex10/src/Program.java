import java.util.Scanner;

import entities.BancoOnline;
import entities.Cliente;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		BancoOnline on = new BancoOnline();
		
		method2();
	
	}
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Menu Inicial %n"
				+ "---------------------------%n"
				+"1 add cliente %n"
				+"2 remover cliente %n"
				+"3 consultar saldo%n"
				+"4 depositar%n"
				+"5 sacar%n"
				+"6 simular rendimentos%n");
		int n = sc.nextInt();
		
		switch (n) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 6:
			method6();
			break;
		}
	}
	public static void method2() {
		method1();
	}
	public static void method3() {
		
	}
	public static void method4() {
		
	}
	public static void method6() {
		BancoOnline on = new BancoOnline();
		Scanner sc = new Scanner(System.in);
		System.out.println("entre com o valor os meses e o valor para simular: ");
		int meses = sc.nextInt();
		double valor = sc.nextDouble();
		System.out.printf("Seus rendimentos em: %d são: %.3f%n",meses,on.simularRendimentos(valor, meses));
		System.out.println();
		System.out.print("Deseja voltar ao menu inicial? (s/n)");
		char s = sc.next().charAt(0);
		if(s=='s') {
			method2();
		}else {
			System.out.println("Fim de programa");
		}
		
	}
}
