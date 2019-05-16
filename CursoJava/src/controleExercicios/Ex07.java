package controleExercicios;

import java.util.Scanner;

/**
 * 
 * @author André Oliveira 
 * 7. Criar um programa que enquanto estiver recebendo números positivos, imprime no 
 * console a soma dos números inseridos, 
 * caso receba um número negativo, encerre o programa. 
 * Tente utilizar a estrutura do while.
 *
 */

public class Ex07 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um numero inteiro positivo: ");
			numero = scanner.nextInt();
			
			if (numero >= 0) {
				somadorDeNumeros += numero; // somadorDeNumeros = somadorDeNumeros + numero;
				System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
			}
		}
		scanner.close();
	}

}
