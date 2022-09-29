package exemplo_polimorfismo;

public class Executavel {
    
    public static void main(String[] args) {
        
        Funcionario f1 = new FuncionarioCLT("Roberta", 23, 12345);
        Funcionario f2 = new FuncionarioPJ("Sara", 25, 54321);

        Funcionario[] funcionarios = {f1, f2};

        Contabilidade con = new Contabilidade();

        for (int i = 0; i < funcionarios.length; i++) {
            con.gerarDemonstrativo(funcionarios[i]);
        }
    }
}
