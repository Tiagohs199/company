import java.util.Scanner;

public class Teste {

	public void texto() {
		
		Scanner sc = new Scanner(System.in);
		
		String first,m,t,middle,last;
		int age;
		double high;
		char sex;
		m="";
		
		System.out.print("Digite seu nome completo: ");
		first = sc.next();
		middle = sc.next();
		last = sc.next();
		System.out.print("digite sua idade: ");
		age = sc.nextInt();
		System.out.print("Digite sua altura: ");
		high= sc.nextDouble();
		System.out.print("digite seu sexo: ");
		sex= sc.next().charAt(0);
		System.out.print("Digite uma frase de segurança: ");
		sc.nextLine();
		t = sc.nextLine();
		
		if (sex == 'm') {
			m = "masculino";
		}else if (sex =='f') {
			m="feminino";
		}
				
			
		
		
		System.out.printf("seu nome: %s %s%n",first,middle);
		System.out.printf("sobrenome: %s%n",last);
		System.out.printf("sua idade: %d\n",age);
		System.out.printf("sua altura: %.2f\n",high);
		System.out.printf("seu sexo: %s\n",sex);
		System.out.printf("Sua frase de segurança: %s%n",t);
		
		
		
		sc.close();
	}

}
