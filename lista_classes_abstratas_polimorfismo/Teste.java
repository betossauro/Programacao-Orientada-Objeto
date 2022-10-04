package lista_classes_abstratas_polimorfismo;

import java.text.DecimalFormat;
import java.util.Random;

public class Teste {
    public static void main(String[] args) {

        DecimalFormat formatador = new DecimalFormat("0.00");
        Random gerador = new Random();
        FormaGeometrica[] formas = new FormaGeometrica[7];
        for (int i = 0; i < formas.length; i++) {
            int tipo = gerador.nextInt(7);
            switch(tipo){
                case 0 : {
                    Quadrado quadrado = new Quadrado("Quadrado", gerador.nextInt(9) + 1);
                    formas[i] = quadrado;
                    break;
                }
                case 1 : {
                    Circulo circulo = new Circulo("Circulo", gerador.nextInt(9) + 1);
                    formas[i] = circulo;
                    break;
                }
                case 2 : {
                    Retangulo retangulo = new Retangulo("Retangulo", gerador.nextInt(9) + 1,  gerador.nextInt(9) + 1);
                    formas[i] = retangulo;
                    break;
                }
                case 3 : {
                    Losango losango = new Losango("Losango", gerador.nextInt(9) + 1, gerador.nextInt(9) + 1, gerador.nextInt(9) + 1, gerador.nextInt(9) + 1);
                    formas[i] = losango;
                    break;
                }
                case 4 : {
                    TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo("Triangulo Retangulo", gerador.nextInt(9) + 1, gerador.nextInt(9) + 1);
                    formas[i] = trianguloRetangulo;
                    break;
                }
                case 5 : {
                    TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero("Triangulo Equilatero", gerador.nextInt(9) + 1);
                    formas[i] = trianguloEquilatero;
                    break;
                }
                case 6 : {
                    TrianguloIsosceles trianguloIsosceles = new TrianguloIsosceles("Triangulo Isosceles", gerador.nextInt(9) + 1, gerador.nextInt(9) + 1);
                    formas[i] = trianguloIsosceles;
                    break;
                }
            }
        }
        System.out.println("Imprimindo formas geométricas!");
        for (int i = 0; i < formas.length; i++) {
            System.out.println("Nome: " + formas[i].getNome());
            System.out.println("Área: " + formatador.format(formas[i].calcularArea()));
            System.out.println("Perímetro: " + formatador.format(formas[i].calcularPerimetro()));
            System.out.println("------------------------------");
        }
    }
}
