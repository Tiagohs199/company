
public class ContaPoupanca {
	double saldo;
	
	public ContaPoupanca() {
	}
	public ContaPoupanca(double aSaldo) {
		this.saldo = aSaldo;
	}
	
	void depositar(double valor) {
		if(valor>0) {
			this.saldo += valor;
		}
		
	}
	double simularRendimentos(int meses, double juros){
		double rendimento = this.saldo;
		if(meses >0 && juros >0) {
			for(int i=0; i<meses;i++) {
				rendimento += rendimento * juros;
			}
		}
		return rendimento;
		}
	void display() {
		System.out.printf("Seu saldo na poupança: %.2f",saldo);
		
	}
}
