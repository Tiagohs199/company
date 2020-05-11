
public class TesteProfessor {

	public static void main(String[] args) {
		
		Professor professor = new Professor();
		Coordenador coordenador = new Coordenador();
		
		professor.id = 01;
		professor.nome = "Tiago";
		professor.endereco = "teodoro";
		professor.telefone = "2455-3434";
		professor.salario = 3000;
		professor.horaAulas = 300;
		
		coordenador.id = 07;
		coordenador.nome = "lucas";
		coordenador.endereco = "francisco";
		coordenador.telefone = "3212-3456";
		coordenador.salario = 7000;
		coordenador.bonus = 300;
		
		professor.display();
		coordenador.display();
		
		System.out.printf("salario com bonus: %.2f",coordenador.consultaSalario());
		
	}

}
