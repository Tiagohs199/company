package entities;

public class Cliente {
	private String name;
	private String CPF;
	private Double saldo;
	
	public Cliente() {
	}
	public Cliente(String name, String cPF, Double saldo) {
		this.name = name;
		CPF = cPF;
		this.saldo = saldo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cliente [name=" + name + ", CPF=" + CPF + ", saldo=" + saldo + "]";
	}
	

}
