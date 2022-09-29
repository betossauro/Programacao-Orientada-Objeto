package exemplo_polimorfismo;

public class Contabilidade {
    
    public void gerarDemonstrativo(Funcionario func){
        System.out.println("O funcionário " + func.getNome() + 
        " recebeu o pagamento de R$" + func.calcularPagamento());
    }
}
