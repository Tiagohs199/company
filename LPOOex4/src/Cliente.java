
public class Cliente {
	
	String nome, CPF, agencia,codigoConta;
	
	ContaCorrente contaCorrente;
	ContaPoupanca poupanca;
	
	public Cliente() {
		
	}
	public Cliente(String aNome, String aCPF, String aAgencia, String aCodigoConta,ContaCorrente aContaCorrente,ContaPoupanca aPoupanca) {
		
		this.nome = aNome;
		this.CPF = aCPF;
		this.agencia = aAgencia;
		this.codigoConta = aCodigoConta;
		this.contaCorrente = aContaCorrente;
		this.poupanca = aPoupanca;
		
		
	}
	
	void transferirCCParaPoupanca(float valor) {
		if(contaCorrente.saldo > 0) {
			poupanca.saldo += valor;
			
		}else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	void transferirPoupancaParaCC(float valor) {
		if(poupanca.saldo > 0) {
			contaCorrente.saldo += valor;
		}else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	void display() {
		System.out.printf("Seu nome: %s%nSeu CPF: %s%nSua Agencia: %s-%s%n",nome,CPF,agencia,codigoConta);
		
	}

}
