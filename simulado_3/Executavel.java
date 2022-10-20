package simulado_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Executavel {
    
    public static void main(String[] args) {
        
        DateTimeFormatter fin = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Autores
        Endereco end1 = new Endereco("Rua das Maças", 100, "Ingleses", "Florianópolis", "Santa Catarina");
        LocalDate dt1 = LocalDate.parse("01/10/1946", fin);
        Autor a1 = new Autor("Carlos Drummond", dt1, end1);
        Endereco end2 = new Endereco("Rua das Laranjas", 200, "Aririu", "Palhoça", "Santa Catarina");
        LocalDate dt2 = LocalDate.parse("15/03/1915", fin);
        Autor a2 = new Autor("Machado de Assis", dt2, end2);
        Endereco end3 = new Endereco("Rua das Uvas", 300, "Pedra Branca", "Palhoça", "Santa Catarina");
        LocalDate dt3 = LocalDate.parse("21/05/1927", fin);
        Autor a3 = new Autor("Cecilia Meireles", dt3, end3);
        Endereco end4 = new Endereco("Rua das Melancias", 400, "Estreito", "Florianópolis", "Santa Catarina");
        LocalDate dt4 = LocalDate.parse("04/06/1934", fin);
        Autor a4 = new Autor("Osvald Andrade", dt4, end4);
        // Publicações Carlos Drummond
        LocalDate dt5 = LocalDate.parse("01/12/2012", fin);
        LocalDate dt6 = LocalDate.parse("30/01/1983", fin);
        Revista r1 = new Revista("Veja", 60, dt5, a1);
        Livro l1 = new Livro("Brejo das Almas", 8, dt6, a1);
        // Publicações Machado Assis
        LocalDate dt7 = LocalDate.parse("01/06/2013", fin);
        LocalDate dt8 = LocalDate.parse("13/05/1892", fin);
        Revista r2 = new Revista("IstoÉ", 80, dt7, a2);
        Livro l2 = new Livro("Quincas Borba", 1, dt8, a2);
        // Publicações Cecilia Meireles
        LocalDate dt9 = LocalDate.parse("01/09/2011", fin);
        LocalDate dt10 = LocalDate.parse("20/11/1934", fin);
        Revista r3 = new Revista("Auto Esporte", 20, dt9, a3);
        Livro l3 = new Livro("Colar de Carolina", 3, dt10, a3);
        // Publicações Osvald Andrade
        LocalDate dt11 = LocalDate.parse("01/04/2010", fin);
        LocalDate dt12 = LocalDate.parse("28/07/1941", fin);
        Revista r4 = new Revista("Super Interessante", 100, dt11, a4);
        Livro l4 = new Livro("Os Condenados", 7, dt12, a4);
        // Biblioteca
        Endereco end5 = new Endereco("Rua das Mangas", 600, "Centro", "Florianópolis", "Santa Catarina");
        Obra[] obras = {r1, l1, r2, l2, r3, l3, r4, l4};
        Biblioteca b1 = new Biblioteca("Biblioteca Central", end5, obras);

        // Questão 3 - A
        b1.contabilizarObras();
        System.out.println("----------------------------------------------------");
        // Questão 3 - B
        System.out.println("A obra mais antiga: " + b1.identificarObraMaisAntiga());
        System.out.println("----------------------------------------------------");
        // Questão 3 - C
        b1.identificarAutorMaisNovo();
        System.out.println("----------------------------------------------------");
        // Questão 3 - D
        b1.calcularDiferencaAutores();
        System.out.println("----------------------------------------------------");
        // Questão 3 - E
        b1.localizarEnderecoAutor("Carlos Drummond");
        System.out.println();
        b1.localizarEnderecoAutor("Machado de Assis");
        System.out.println();
        b1.localizarEnderecoAutor("Cecilia Meireles");
        System.out.println();
        b1.localizarEnderecoAutor("Osvald Andrade");
        System.out.println("----------------------------------------------------");
        // Questão 3 - F
        b1.listarAutoresCidade("Florianópolis");
        System.out.println();
        b1.listarAutoresCidade("Palhoça");
    }
}
