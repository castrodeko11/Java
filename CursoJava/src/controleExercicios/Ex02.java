package controleExercicios;

import java.util.Scanner;

/**
 * 
 * @author André Oliveira
 * 2. Criar um programa informa se o ano atual é um ano bissexto;
 *
 */

public class Ex02 {
	public static void main(String[] args) {
		int n = 0;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		n = scanner.nextInt();

		if (n / 4 == 0) {
			System.out.println("O ano " + n + " è bissexto");
		} else {

			System.out.println("O ano " + n + " não é bissexto");
		}
		scanner.close();
	}
}
