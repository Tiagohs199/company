
public class Pessoa {
	int id;
	String nome,
	 telefone,
	endereco;
	
	Pessoa(){
		
	}
	Pessoa(int ald, String aNome, String aTelefone, String aEndereco){
		this.id = ald;
		this.nome = aNome;
		this.telefone = aTelefone;
		this.endereco = aEndereco;
		
			
	}
	
	public void display(){
		System.out.printf("Id: %d%nNome: %s%nTelefone: %s%nEndereço: %s%n",id,nome,telefone,endereco);
		
		
	}
	
}
