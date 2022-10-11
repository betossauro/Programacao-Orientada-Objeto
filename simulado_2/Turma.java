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

	public int contarAlunos() {
		return this.getAlunos().length;
	}

	public String[] listarNomesAlunas() {
		String[] nomes = new String[this.getAlunos().length];
		for (int i = 0; i < alunos.length; i++) {
				nomes[i] = alunos[i].getNome();
			}
		return nomes;
	}
}
