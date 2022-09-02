package lista_strings;

public class Comandos {

    static void contadorDeVogais(String frase) {
        char[] texto = new char [frase.length()];
        texto = frase.toCharArray();
        int contador = 0;

        for (int i = 0; i < texto.length; i++) {
            if (texto[i] == 'a') {
                contador++;
            }
            if (texto[i] == 'e') {
                contador++;
            }
            if (texto[i] == 'i') {
                contador++;
            }
            if (texto[i] == 'o') {
                contador++;
            }
            if (texto[i] == 'u') {
                contador++;
            }
        }
        System.out.println("A quantidade de vogais é: " + contador);
    }
}
