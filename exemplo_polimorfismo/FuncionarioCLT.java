package exemplo_polimorfismo;

public class FuncionarioCLT extends Funcionario {

    
    public FuncionarioCLT(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }

    public FuncionarioCLT() {
        super();
    }

    @Override
    public double calcularPagamento() {
        return 1000 * 2.5;
    }
    
}
