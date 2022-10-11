package simulado_2;

public class Turma {
	
	private int serie;
	private Aluno[] alunos;
	private Professor regente;
	
	public Turma(int serie, Aluno[] alunos, Professor regente) {
		super();
		this.serie = serie;
		this.alunos = alunos;
		this.regente = regente;
	}

	public Turma() {
		super();
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Professor getRegente() {
		return regente;
	}

	public void setRegente(Professor regente) {
		this.regente = regente;
	}

	public void listarAlunos() {
		for (int i = 0; i < this.getAlunos().length; i++) {
				System.out.println(this.getAlunos()[i].getNome());
			}

	}

	public void listarAlunosPorCidade(String cidade) {
		for (int i = 0; i < this.getAlunos().length; i++) {
			if(cidade.equalsIgnoreCase(this.getAlunos()[i].getEndereco().getCidade())) {
				System.out.println(this.getAlunos()[i].getNome());
			}
		}
	}
}
