
public class TesteAluno {

	public static void main(String[] args) {
		double notaNP1 = 5.0;
		double notaNP2 = 7.0;
		Boletim boletim =new Boletim(notaNP1,notaNP2);
		Aluno aluno = new Aluno();
		
		aluno.id = 12;
		aluno.nome = "Fabio";
		aluno.telefone = "1243-9809";
		aluno.endereco = "osvaldo";
		aluno.boletim=boletim;
		
		
		
		aluno.display();
		aluno.foiAprovado();

	}

}
