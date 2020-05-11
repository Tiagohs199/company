import java.util.Scanner;

public class ContaCorrente {
	
	double saldo;
	
	Scanner sc = new Scanner(System.in);
	
	public ContaCorrente() {
		
	}
	public ContaCorrente(double aSaldo) {
		this.saldo = aSaldo;
	}
	
	void depositar(double valor) {
		if( valor > 0 ) {
			this.saldo+= valor;
		}
		
	}
	void display() {
		System.out.printf("Seu saldo da conta corrente: %.2f%n",saldo);
		
	}
}
