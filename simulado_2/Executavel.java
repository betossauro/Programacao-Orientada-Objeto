package simulado_2;

public class Executavel {

	public static void main(String[] args) {
		
		Endereco end1 = new Endereco("Rua das Jububas", 100, "Campeche", "Florianópolis", "SC");
		Aluno a1 = new Aluno("Juliana Silva", 15, end1);
		
		Endereco end2= new Endereco("Rua das Gomas", 200, "Pedra Branca", "Palhoça", "SC");
		Aluno a2 = new Aluno("Daniele Veiga", 14, end2);
		
		Endereco end3 = new Endereco("Rua dos Caramelos", 300, "Kobrasol", "São José", "SC");
		Aluno a3 = new Aluno("Bruna Andrade", 13, end3);
		
		Endereco end4= new Endereco("Rua dos Pirulitos", 400, "Estreito", "Florianópolis", "SC");
		Aluno a4 = new Aluno("Helena de Andrade", 16, end4);
		
		Endereco end5 = new Endereco("Rua dos Chicletes", 500, "Aririú", "Palhoça", "SC");
		Aluno a5 = new Aluno("Mary Souza", 15, end5);
		
		Endereco end6 = new Endereco("Rua daos Bombons", 600, "Forquilhinhas", "São José", "SC");
		Aluno a6 = new Aluno("Paula Vieira", 14, end6);
		
		Endereco end7= new Endereco("Rua das Balas", 700, "Capoeiras", "Florianópolis", "SC");
		Aluno a7 = new Aluno("Renata Augusta", 15, end7);
		
		Endereco end8 = new Endereco("Rua das Trufas", 800, "Centro", "Biguaçu", "SC");
		Aluno a8 = new Aluno("Luiza Pires", 15, end8);
		
		Endereco end9= new Endereco("Rua dos Doces", 900, "Campinas", "São José", "SC");
		Aluno a9 = new Aluno("Beatriz Santos", 14, end9);
		
		Endereco end10 = new Endereco("Rua dos Confetes", 1000, "Capoeiras", "Florianópolis", "SC");
		Aluno a10 = new Aluno("Suellen Lima", 17, end10);

		Endereco end11= new Endereco("Rua das Enciclopédias", 500, "Centro", "Florianópolis", "SC");
		Professor regenteTurmaA = new Professor("Zeca", 45, end11, "Matemática");
		
		Endereco end12= new Endereco("Rua dos Dicionários", 750, "Centro", "Florianópolis", "SC");
		Professor regenteTurmaB = new Professor("Pires", 40, end12, "Português");
		
		Aluno[] alunosTurmaA = {a1, a2, a3, a4, a5};
		Aluno[] alunosTurmaB = {a6, a7, a8, a9, a10};
		
		Turma turmaA = new Turma(7, alunosTurmaA, regenteTurmaA);
		Turma turmaB = new Turma(8, alunosTurmaB, regenteTurmaB);
		Turma[] turmas = {turmaA, turmaB};
		
		Endereco end13 = new Endereco("Rua dos Estudos", 1000, "Centro", "Florianópolis", "SC");
		Escola escola = new Escola("Escola Básica das Meninas de Florianópolis", "3232-3232", end13, turmas);
		
		// Questão 3 - A
		System.out.println("A escola possui " + escola.contabilizarAlunos() + " alunas.");
		System.out.println("------------------------------------");
		// Questão 3 - B
		System.out.println("Endereço do Regente Zeca: \n" + escola.localizarEnderecoRegente("Zeca"));
		System.out.println();
		System.out.println("Endereço do Regente Pires: \n" + escola.localizarEnderecoRegente("Pires"));
		System.out.println("------------------------------------");
		// Questão 3 - C
		System.out.println("Alunas do 7º ano:");
		escola.listarNomeAlunas(7);
		System.out.println();
		System.out.println("Alunas do 8º ano:");
		escola.listarNomeAlunas(8);
		System.out.println("------------------------------------");
		// Questão 3 - D
		escola.listarRegenteMaisNovo();
		System.out.println("------------------------------------");
		// Questão 3 - E (parametro = nome da cidade)
		escola.listarAlunasPorCidade("Florianópolis");
		System.out.println();
		escola.listarAlunasPorCidade("São José");
		System.out.println();
		escola.listarAlunasPorCidade("Biguaçu");
		System.out.println();
		escola.listarAlunasPorCidade("Palhoça");
	}
}
