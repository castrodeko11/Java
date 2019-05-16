package controleExercicios;

import java.util.Scanner;

/**
 * 
 * @author André Oliveira
 * 4. Criar um programa que receba um número e diga se ele é um número primo.
 *
 */

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n,contadorDeDivisores = 0;
		
		
		System.out.println("Informe um número inteiro: ");
		n = scanner.nextInt();
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + n + " é primo.");
		} else {
			System.out.println("\nO numero " + n + " não é primo.");
		}

		scanner.close();
		
		
	}
}
