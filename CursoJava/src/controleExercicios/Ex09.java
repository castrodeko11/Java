package controleExercicios;

import java.util.Scanner;

/**
 * 
 * @author Andr� Oliveira
 * 9. Crie um programa que recebe 10 valores e ao final imprima o maior n�mero.
 *
 */

public class Ex09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float  n, maior = 0;

		System.out.println("Informe 10 Valores");
		for (float i = 1; i < 11; i++) {
			System.out.printf("\nInforme " + i + " Valor: ");
			n = scanner.nextFloat();

			if (n > maior) {

				maior = n;
			}

		}
		
		System.out.println("\nO maior Valor �: " + maior );
		scanner.close();
	}

}
