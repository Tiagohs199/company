
public class Coordenador extends Funcionario{
	
	double bonus;
	
	Coordenador(){
		
	}

	Coordenador(int ald,String aNome, String aTelefone,String aEndereco, double aSalario, double bonus){
		super(ald,aNome,aTelefone,aEndereco,aSalario);
		this.bonus = bonus;
		
	}
	
	public double consultaSalario() {
		return super.salario + this.bonus;
		
		 
	}
	
	public void display() {
		super.display();
		
		System.out.println("bonus do coordenador "+bonus);
		
		
	}
}
