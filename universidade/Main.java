package universidade;

public class Main {
	
	public static void main(String[] args) {
		
		Database db = new Database();
		
		/*
		 * Exemplos de como utilizar os m�todos da classe Database, para acessar informa��es do banco de dados
		 * 
		 * Os m�todos retornam um objecto respetivo a o que est� sendo pesquisado. 
		 * Por exemplo, os m�todos .searchAlunoById e .searchAlunoByNome, retornam um objeto Aluno com os atributos
		 * .id, .nome e .curso (.curso � um objeto da classe curso).
		 * */
		
		System.out.println("---------- Pesquisando um Aluno ----------");
		db.searchAlunoById("100").imprimirDados(); //M�todo .searchAlunoById(id) para pesquisar aluno por sua ID
		System.out.println("--------------------");
		db.searchAlunoByNome("Noah Oliveira").imprimirDados(); //M�todo .searchAlunoByNome(id) para pesquisar aluno por seu nome
		
		System.out.println("\n---------- Pesquisando um Curso ----------");
		db.searchCursoById("5").imprimirDados(); //M�todo .searchCursoById(id) para pesquisar curso por sua ID
		System.out.println("--------------------");
		db.searchCursoByNome("Sistemas Para Internet").imprimirDados(); //M�todo .searchCursoByNome(id) para pesquisar curso por seu nome

		System.out.println("\n---------- Pesquisando uma Disciplina ----------");
		db.searchDisciplinaById("66").imprimirDados(); //M�todo .searchCursoById(id) para pesquisar curso por sua ID
		System.out.println("--------------------");
		db.searchDisciplinaByNome("Geoprocessamento").imprimirDados(); //M�todo .searchCursoByNome(id) para pesquisar curso por seu nome
	
		System.out.println("\n---------- Pesquisando uma Nota ----------");
		db.searchNotaById("365").imprimirDados(); //M�todo .searchNotaById(id) para pesquisar uma nota de um aluno por sua ID
	}
	
	
}