package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double nota;

		System.out.printf("Informe sua nota: ");
		nota = read.nextDouble();

		System.out.printf("Status de Aprovação: ");
		if (nota >= 9) {
			System.out.println("Quadro de Honra !");
		} else if (nota >= 7) {
			System.out.println("Aprovado");
		} else if (nota >= 5.5) {
			System.out.println("Recuperação");
		} else if (nota >= 3.5) {
			System.out.println("Recuperação + Trabalho");
		} else {
			System.out.println("Reprovado");
		}
		read.close();
	}

}
