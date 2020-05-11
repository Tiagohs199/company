package entities;

import java.util.TreeMap;

public class Drabesco extends BancoOnline {
	
	private Double juros;
	private TreeMap<String, Cliente>clientes;
	
	public Drabesco() {
		clientes= new TreeMap<>();
	}
	public void adicionaCliente(Cliente  novoCliente) {
		if(novoCliente != null) {
			if(!clientes.containsKey(novoCliente.getName())) {
				clientes.put(novoCliente.getName(), novoCliente);
				System.out.println("Cliente "+novoCliente.getName()+" cadastrado com sucesso! ");
			}else {
				System.out.println("nome de usuario ja existe");
			}
			
		}
	}
	public Double getJuros() {
		return juros;
	}
	public void setJuros(Double juros) {
		this.juros = juros;
	}
	public TreeMap<String, Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(TreeMap<String, Cliente> clientes) {
		this.clientes = clientes;
	}
}
