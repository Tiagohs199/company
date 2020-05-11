package entities;

public class BancoOnline {
	
	Cliente cliente = new Cliente();
	
	public double saldo(String CPF) {
		return cliente.getSaldo();
	}
	public void sacar(String CPF,double valor) {
		double saldo = cliente.getSaldo();
		saldo =-valor;
		cliente.setSaldo(saldo);
		
	}
	public void depositar(String CPF, double valor) {
		double saldo = cliente.getSaldo();
		saldo =+ valor;
		cliente.setSaldo(saldo);
	}
	public Double simularRendimentos(double valor, int meses) {
		double rendimento = valor;
		for(int i=0;i<meses;i++) {
			double valoi= rendimento +( rendimento*0.05);
			rendimento =+ valoi;	
		}
		
		
		return rendimento;
	}
	public String getNomebanco() {
		return null;
	}
	@Override
	public String toString() {
		return "BancoOnline [cliente=" + cliente + "]";
	}
	
}
