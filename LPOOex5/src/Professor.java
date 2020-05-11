
public class Professor extends Funcionario{
	
	int horaAulas;
	
	Professor(){
		
	}
	public Professor(int ald, String aNome, String aTelefone, String aEndereco, double salario, int aHorasAula){
		super(ald,aNome,aTelefone,aEndereco,salario);
		this.horaAulas = aHorasAula;
		
	}
	
	public void display() {
		
		super.display();
		System.out.println("tempo de aula: "+horaAulas);
		
	}
	
	

}
