package controleExercicios;

import java.util.Scanner;

/**
 * 
 * @author André Oliveira
 * 5. Refatorar o exercício 04, utilizando a estrutura switch.
 *
 */

public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0, contadorDeDivisores = 0;

		System.out.println("Digite um número: ");
		n = scanner.nextInt();

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {
		case 0:
			System.out.println("O numero " + n + " é um numero primo.");
			break;

		default:
			System.out.println("N/A");

		}

	}

}
