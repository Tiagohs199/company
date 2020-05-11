
public class Funcionario extends Pessoa{
	double salario;
	
	Funcionario(){
		
	}
	
	public Funcionario(int ald, String aNome,String aTelefone, String aEndereco, double aSalario){
		super(ald,aNome,aTelefone,aEndereco);
		this.salario = aSalario;
		
	}
	public double consultaSalario() {
		
		
		return salario;
	}
	public void display(){
		super.display();
		System.out.println("salario atual: "+salario);
		
	}

}
