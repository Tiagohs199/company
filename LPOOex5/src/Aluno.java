
public class Aluno extends Pessoa{
	
	Boletim boletim;
	
	Aluno(){
	}
	
	Aluno(int ald, String aNome, String aTelefone, String aEndereco,Boletim aBoletim){
		super(ald,aNome,aTelefone,aEndereco);
		boletim = aBoletim;
		
	}
	
	public boolean foiAprovado() {
		if(calculaMedia() >=6.0) {
			return true;
		}else {
			return false;
		}
		
	}
	public double calculaMedia() {
		return (boletim.notaNP1 + boletim.notaNP2)/2;
		
	}
	
	public void display() {
		super.display();
		boletim.display();
		
	}
}
