package exemplos;

public class UtilizandoString {
    public static void main(String[] args) {
        String disciplina = new String();
        disciplina = "Programação Orientada a Objetos";

        System.out.println("O tamanho da String disciplina é: " + disciplina.length());
                                         // length -> propriedade Array
        if (disciplina.length() > 10) {  // length() -> método length
            System.out.println("Essa é uma String longa.");
        } else {
            System.out.println("Essa é uma String curta.");
        }
        System.out.println();

        // charAt -> método para identificar caractere em posição específica

        System.out.println("O caracter da posição 12 é o: " + disciplina.charAt(12)); 

        System.out.println();

        char[] letras1 = new char[11];

        // getChars

        disciplina.getChars(0, 11, letras1, 0); // recuperar um conjunto de caracteres de uma String seguindo (srcBegin, scrEnd, dst, dstBegin)

        for (int i = 0; i < letras1.length; i++) {
            System.out.println("O caracter da posição " + i + " é: " + letras1[i]);
        }

        System.out.println();

        String curso = disciplina;

        if (disciplina == curso) {
            System.out.println("São iguais.");
        }

        String nome = new String("Duke");
        String sobrenome = new String("Duke");

        if (nome == sobrenome) {
            System.out.println("São nomes iguais.");
        } else {
            System.out.println("São nomes diferentes.");
        }

        // equals

        if (nome.equals(sobrenome)) {
            System.out.println("São nomes iguais.");
        } else {
            System.out.println("São nomes diferentes.");
        }

        System.out.println();

        // Dica da dica: comparar strings em ordem alfabética e quem vier primeiro é o menor
        // compareTo

        String nome1 = new String("Duke");
        String nome2 = new String("Duke");
        String nome3 = new String("Java");

        int numero1 = nome1.compareTo(nome2);
        int numero2 = nome1.compareTo(nome3);
        int numero3 = nome3.compareTo(nome1);

        System.out.println(numero1 + " - Tamanhos iguais.");
        System.out.println(numero2 + " String - 1 menor que String 2.");
        System.out.println(numero3 + " String - 1 maior que String 2.");


        System.out.println();

        // toCharArray
        String frase = new String("Duke é o mascote do Java.");

        char[] letras = new char [frase.length()];
        letras = frase.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        System.out.println();
        // startWith & endWith

        boolean inicia = frase.startsWith("mas", 9);
        boolean finaliza = frase.endsWith("va.");

        System.out.println(inicia);
        System.out.println(finaliza);

        System.out.println();
        
        // indexOf & lastIndexOf

        int posicao1 = frase.indexOf("mas");
        int posicao2 = frase.indexOf("Ja", 10);
        int posicao3 = frase.lastIndexOf("do");
        int posicao4 = frase.lastIndexOf("ote", 10);

        System.out.println(posicao1);
        System.out.println(posicao2);
        System.out.println(posicao3);
        System.out.println(posicao4);

        System.out.println();

        // substring

        String palavras = frase.substring(9);
        String palavra = frase.substring(9, 16);

        System.out.println(palavras);
        System.out.println(palavra);

        System.out.println();

        // replace & replaceFirst & replaceAll  

        String frase2 = new String("A Duke é o mascote do Java.");
        String novaFrase = frase2.replace('A', 'O');
        String novaFrase2 = frase2.replaceAll("Java", "Duke");
        novaFrase2 = novaFrase2.replaceFirst("Duke", "Java");
        novaFrase2 = novaFrase2.replace('A', 'O');

        System.out.println(novaFrase);
        System.out.println(novaFrase2);

        System.out.println();

        String troca = "ab aaa baab";

        String novaTroca = troca.replace("a+","b");
        String novaTroca2 = troca.replaceAll("a+","b");

        System.out.println(novaTroca);
        System.out.println(novaTroca2);
        System.out.println();

        // toUpperCase & toLowerCase

        System.out.println(frase2.toUpperCase());
        System.out.println(frase2.toLowerCase());
        System.out.println(frase2);
        System.out.println();

        // concat && trim
        String frase3 = new String("    O Duke é o mascote do Java  ");
        String complemento = " desde a versão 1.";

        System.out.println(frase3.trim());
        System.out.println(frase3.trim().concat(complemento));
        System.out.println(frase3);
        System.out.println();

        // split
        frase2 = frase2.replace('.', ' ');
        String[] palavras2 = frase2.split(" ");
        for (int i = 0; i < palavras2.length; i++) {
            System.out.println(palavras2[i]);
        }
    }
}
