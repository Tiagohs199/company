package entities.app;

import entities.BancoOnline;

public class App {
	private BancoOnline bancoAPI;
	private String clienteCPF;
	
	public App() {
	}
	public App(BancoOnline bancoAPI, String clienteCPF) {
		super();
		this.bancoAPI = bancoAPI;
		this.clienteCPF = clienteCPF;
	}
	public BancoOnline getBancoAPI() {
		return bancoAPI;
	}
	public void setBancoAPI(BancoOnline bancoAPI) {
		this.bancoAPI = bancoAPI;
	}
	public String getClienteCPF() {
		return clienteCPF;
	}
	public void setClienteCPF(String clienteCPF) {
		this.clienteCPF = clienteCPF;
	}
	public Double saldo() {
		return bancoAPI.saldo(clienteCPF);
	}
	public void sacar(Double valor) {
		bancoAPI.sacar(clienteCPF, valor);
	}
	public void depositar(Double valor) {
		bancoAPI.depositar(clienteCPF, valor);
	}
	public double simularRendimentos(double valor, int meses) {
		return bancoAPI.simularRendimentos(valor, meses);
	}
	public String getNomeBanco() {
		return bancoAPI.getNomebanco();
	}
}
