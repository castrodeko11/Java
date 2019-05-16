package controleExercicios;

import java.util.Scanner;

/**
 * 
 * @author André Oliveira
 * 3. Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for 
 * maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e
 * maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
 *
 */

public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float n1, n2, media;

		System.out.printf("Digite a primeira nota: ");
		n1 = scanner.nextFloat();

		System.out.printf("Digite a segunda nota: ");
		n2 = scanner.nextFloat();

		media = (n1 + n2) / 2;

		if (media >= 7) {
			System.out.printf("Aprovado, sua nota é: " + media);
		} else if (media > 4 && media < 7) {
			System.out.printf("Recuperação, sua nota é: " + media);
		} else {
			System.out.printf("Reprovado, sua nota é:" + media);
		}
		scanner.close();
	}
}
