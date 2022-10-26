package simulado_3;

import java.time.Period;

public class Biblioteca {
    
    private String nome;
    private Endereco enderecoBiblioteca;
    private Obra[] listaObras;
    
    public Biblioteca(String nome, Endereco enderecoBiblioteca, Obra[] listaObras) {
        super();
        this.nome = nome;
        this.enderecoBiblioteca = enderecoBiblioteca;
        this.listaObras = listaObras;
    }

    public Biblioteca() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnderecoBiblioteca() {
        return enderecoBiblioteca;
    }

    public void setEnderecoBiblioteca(Endereco enderecoBiblioteca) {
        this.enderecoBiblioteca = enderecoBiblioteca;
    }

    public Obra[] getListaObras() {
        return listaObras;
    }

    public void setListaObras(Obra[] listaObras) {
        this.listaObras = listaObras;
    }

    public void contabilizarObras() {
        System.out.println("A biblioteca possui " + this.getListaObras().length + " obras.");
    }

    public Obra identificarObraMaisAntiga() {
        Obra maisAntigo = this.getListaObras()[0];
        for (int i = 0; i < this.getListaObras().length; i++) {
            if (this.getListaObras()[i].getDataPublicacao().isBefore(maisAntigo.getDataPublicacao())) {
                maisAntigo = this.getListaObras()[i];
            }
        }
        return maisAntigo;
    }

    public void identificarAutorMaisNovo() {
        Autor maisNovo = this.getListaObras()[0].getAutor();
        for (int i = 0; i < this.getListaObras().length; i++) {
            if (this.getListaObras()[i].getAutor().getDataNascimento().isAfter(maisNovo.getDataNascimento())) {
                maisNovo = this.getListaObras()[i].getAutor();
            }
        }
        System.out.println("O autor mais novo: " + maisNovo);
    }

    public void calcularDiferencaAutores() {
        Autor maisNovo = this.getListaObras()[0].getAutor();
        Autor maisVelho = this.getListaObras()[0].getAutor();
        for (int i = 0; i < this.getListaObras().length; i++) {
            if (this.getListaObras()[i].getAutor().getDataNascimento().isAfter(maisNovo.getDataNascimento())) {
                maisNovo = this.getListaObras()[i].getAutor();
            } else {
                if (this.getListaObras()[i].getAutor().getDataNascimento().isBefore(maisVelho.getDataNascimento())) {
                    maisVelho = this.getListaObras()[i].getAutor();
                }
            }
        }
        Period periodo = Period.between(maisVelho.getDataNascimento(), maisNovo.getDataNascimento());
        System.out.println("Autor mais novo: " + maisNovo.getNome()
                            + "\nAutor mais velho: " + maisVelho.getNome());
        System.out.println("A diferença entre o autor mais novo e mais velho é de " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
    }

    public void localizarEnderecoAutor(String autor) {
        for (int i = 0; i < this.getListaObras().length; i++) {
            if (autor.equalsIgnoreCase(this.getListaObras()[i].getAutor().getNome())) {
                System.out.println("Endereço de " + this.getListaObras()[i].getAutor().getNome() + ": " + this.getListaObras()[i].getAutor().getEnderecoAutor());
                break;
            }
        }
    }

    public void listarAutoresCidade(String cidade) {
        for (int i = 0; i < this.getListaObras().length; i++) {
            if (cidade.equalsIgnoreCase(this.getListaObras()[i].getAutor().getEnderecoAutor().getCidade())) {
                System.out.println("O(a) autor(a) " + this.getListaObras()[i].getAutor().getNome() + " mora em " + this.getListaObras()[i].getAutor().getEnderecoAutor().getCidade());
            }
        }
    }
}
