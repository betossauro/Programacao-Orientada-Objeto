package exemplo_polimorfismo;

public class FuncionarioPJ extends Funcionario {

    

    public FuncionarioPJ(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }

    public FuncionarioPJ() {
        super();
    }

    @Override
    public double calcularPagamento() {
        return (1000 * 2.5) + 5000;
    }
    
}
