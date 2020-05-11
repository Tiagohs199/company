package dadosConta;

public class DadosConta {
	
	private int conta;
	private String name;
	private double deposit;
	
	
	public DadosConta(){
		
	}
	public DadosConta(int conta,String name, double initialDeposit) {
		this.conta = conta;
		this.name = name;
		Add(initialDeposit);
	}
	public DadosConta(int conta,String name) {
		this.conta = conta;
		this.name = name;

	}

	
	public double Add(double add) {	
		return deposit +=add;	
	}
	
	public double subtract(double sub) {
		return deposit -= (sub + 5.00);
	}
	
	
	public int getConta() {
		return conta;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	
	
	
	
	
	public String toString() {
		return  
				"Your account: "+conta
				+", "
				+ "Your name: "+ name+", "
				+ "Balance: $"+deposit;
	}
}
