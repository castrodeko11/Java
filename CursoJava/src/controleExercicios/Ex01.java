package controleExercicios;

import java.util.Scanner;
/**
 * 
 * @author André Oliveira 
 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
 *
 */

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;

		System.out.println("Digite um número inteiro: ");
		n = scanner.nextInt();

		if (n >= 0 && n <= 10) {
			if (n % 2 == 0) {
				System.out.println("o Número " + n + " é Par");
			} else {
				System.out.println("O Número " + n + "é Ímpar");
			}

		} else {
			System.out.println("Digite um número entre 0 e 10");
		}
		scanner.close();

	}
}
