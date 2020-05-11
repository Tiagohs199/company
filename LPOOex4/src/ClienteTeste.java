import java.util.Scanner;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome = "Tiago";
		String CPF = "123.456.789-10";
		String agencia = "1234";
		String codigoConta = "7";
		double saldoContacorrente =200f;
		double apoupanca = 3000f;
		int meses = 4;
		double juros = 0.7;
		double resu;
		
		
		ContaCorrente contaCorrente = new ContaCorrente(saldoContacorrente);
		
		ContaPoupanca poupanca = new ContaPoupanca(apoupanca);
		
		Cliente cliente = new Cliente(nome, CPF, agencia, codigoConta, contaCorrente, poupanca);
		
		
		resu = poupanca.simularRendimentos(meses,juros);
		
		cliente.display();
		contaCorrente.display();
		poupanca.display();
		System.out.printf("%nRendimentos da poupança %.2f ",resu);
		
		
	}
	

}
