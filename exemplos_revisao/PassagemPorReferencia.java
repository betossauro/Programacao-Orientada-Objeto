package exemplos_revisao;

public class PassagemPorReferencia {
    public static void main(String[] args) {
		//Tamanho do array é 5 e os índeces é de 0 a 4.
		int[] numeros = {1, 2, 3, 4, 5};
		int valor = 10;
		//Sem alterar Valor...
		investigarPassagemValor(valor);
		System.out.println("Valor: " + valor);
		//Alterando valor...
		valor = investigarPassagemValor2(valor);
		System.out.println("Valor2: " + valor);
		//Sem alterar Valor...
		investigarPassagemParametro2(numeros);
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Valor no índice " + i + ": " +  numeros[i]);
		}
		//Alterando valor...
		investigarPassagemParametro(numeros);
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Valor no índice " + i + ": " +  numeros[i]);
		}
	}

	static int investigarPassagemValor2(int valor) {
		return valor += valor + 10;	
	}

	static void investigarPassagemValor(int valor) {
		valor += valor;	
		System.out.println("Imprimindo valor... " + valor);
	}

	static void investigarPassagemParametro(int[] numeros) {
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] += numeros[i];
		}
	}
	
	static void investigarPassagemParametro2(int[] numeros) {
		int[] abobrinha = new int[numeros.length];
		for(int i = 0; i < abobrinha.length; i++) {
			abobrinha[i] = numeros[i];
		}
		for(int i = 0; i < abobrinha.length; i++) {
			abobrinha[i] += abobrinha[i];
		}
	}
}
