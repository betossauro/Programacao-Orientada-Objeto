package exemplosOO;

public class Executavel {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Beatriz Lúcia Nascimento");
        c1.setCpf("12956863924");
        c1.setTelefone("24996091001");
        c1.setIdade(39);

        Cliente c2 = new Cliente();
        c2.setNome("Gabrielly Isabelly Jéssica Porto");
        c2.setCpf("55448561926");
        c2.setTelefone("69997678291");
        c2.setIdade(49);

        Cliente c3 = new Cliente();
        c3.setNome("Maya Clara Isis Aparício");
        c3.setCpf("22099424209");
        c3.setTelefone("83996996285");
        c3.setIdade(80);

        Cliente c4 = new Cliente();
        c4.setNome("Teresinha Ana Jesus");
        c4.setCpf("03741727148");
        c4.setTelefone("41998620464");
        c4.setIdade(45);

        Funcionario f1 = new Funcionario();
        f1.setNome("Caleb Bento Raul Nunes");
        f1.setCpf("05504336007");
        f1.setTelefone("69996854276");
        f1.setMatricula(752);

        Funcionario f2 = new Funcionario();
        f2.setNome("Brenda Natália Isabelle Corte Real");
        f2.setCpf("65282064731");
        f2.setTelefone("81995333172");
        f2.setMatricula(135);

        Funcionario f3 = new Funcionario();
        f3.setNome("Tereza Lívia Larissa da Rocha");
        f3.setCpf("48845795268");
        f3.setTelefone("75986673545");
        f3.setMatricula(302);

        Funcionario f4 = new Funcionario();
        f4.setNome("Filipe Pedro Luan Sales");
        f4.setCpf("67727444111");
        f4.setTelefone("68989895362");
        f4.setMatricula(720);

        Cliente[] listaClientes = { c1, c2, c3, c4 };
        Funcionario[] listaFuncionarios = { f1, f2, f3, f4 };

        // 1ª Qual o nome do cliente mais antigo
        Cliente clienteAntigo = listaClientes[0];
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i].getIdade() > clienteAntigo.getIdade()) {
                clienteAntigo = listaClientes[i];
            }
        }
        System.out.println("O nome do cliente mais antigo é: " + clienteAntigo.getNome());

        // 2ª Qual o telefone do funcionário de menor matrícula
        Funcionario telefoneMenorMatricula = listaFuncionarios[0];
        for (int i = 0; i < listaFuncionarios.length; i++) {
            if (listaFuncionarios[i].getMatricula() < telefoneMenorMatricula.getMatricula()) {
                telefoneMenorMatricula = listaFuncionarios[i];
            }
        }
        System.out.println("O telefone do funcionário de menor matrícula é: " + telefoneMenorMatricula.getTelefone());

        // 3ª Existe um funcionário que também é cliente?
        boolean isCliente = false;
        for (int i = 0; i < listaClientes.length; i++) {
            for (int j = 0; j < listaFuncionarios.length; j++) {
                if (listaClientes[i].getCpf().equals(listaFuncionarios[j].getCpf())) {
                    isCliente = true;
                }
            }
        }
            System.out.println("Existe um funcionário que também é cliente? " + (isCliente ? "Sim" : "Não"));
    }
}
