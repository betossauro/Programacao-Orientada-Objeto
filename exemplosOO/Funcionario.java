package exemplosOO;

public class Funcionario extends Pessoa{
    
    private int matricula;

    public Funcionario(String nome, int idade, String cpf, String telefone, Endereco endereco, int matricula) {
        super(nome, idade, cpf, telefone, endereco);
        this.matricula = matricula;
    }

    public Funcionario() {
        super();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
