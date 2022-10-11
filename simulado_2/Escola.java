package simulado_2;

public class Escola {
	
	private String nome;
	private String telefone;
	private Endereco enderecoEscola;
	private Turma[] turmas;
	
	public Escola(String nome, String telefone, Endereco enderecoEscola, Turma[] turmas) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.enderecoEscola = enderecoEscola;
		this.turmas = turmas;
	}

	public Escola() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEnderecoEscola() {
		return enderecoEscola;
	}

	public void setEnderecoEscola(Endereco enderecoEscola) {
		this.enderecoEscola = enderecoEscola;
	}

	public Turma[] getTurmas() {
		return turmas;
	}

	public void setTurmas(Turma[] turmas) {
		this.turmas = turmas;
	}

	public int contabilizarAlunos() {
		int qtdeAlunos = 0;
		for (int i = 0; i < this.getTurmas().length; i++) {
			qtdeAlunos += this.getTurmas()[i].contarAlunos();
		}
		return qtdeAlunos;
	}

	public Endereco localizarEnderecoRegente(String regente) {
		Endereco end = null;
		for (int i = 0; i < this.getTurmas().length; i++) {
			if(regente.equalsIgnoreCase(this.getTurmas()[i].getRegente().getNome())) {
				end = this.getTurmas()[i].getRegente().getEndereco();
			}
		}
		return end;
	}
	
	private void exibirAlunas(String[] alunas) {
		System.out.println("Nome das alunas: ");
		for (int i = 0; i < alunas.length; i++) {
			System.out.println(alunas[i]+ " ");
		}
	}

	public void listarNomeAlunas(int serie) {
		for (int i = 0; i < this.getTurmas().length; i++) {
			if(serie == this.getTurmas()[i].getSerie()) {
				this.exibirAlunas(this.getTurmas()[i].listarNomesAlunas());
			}
		}
	}

	public void listarRegenteMaisNovo() {
		Professor regenteMaisNovo = getTurmas()[0].getRegente();
		for (int i = 0; i < this.getTurmas().length; i++) {
			if (regenteMaisNovo.getIdade() > this.getTurmas()[i].getRegente().getIdade()) {
				regenteMaisNovo = this.getTurmas()[i].getRegente();
			} 
		}
		System.out.println("O regente mais novo é o: " + regenteMaisNovo.getNome());
	}

	public void listarAlunasPorCidade(String cidade) {
		System.out.println("As alunas de " + cidade + " são:");
		for (int i = 0; i < this.getTurmas().length; i++) {
			for (int j = 0; j < this.getTurmas()[i].getAlunos().length; j++) {
				if(cidade.equalsIgnoreCase(this.getTurmas()[i].getAlunos()[j].getEndereco().getCidade())) {
					System.out.println(this.getTurmas()[i].getAlunos()[j].getNome());
				}
			}
		}
	}
}