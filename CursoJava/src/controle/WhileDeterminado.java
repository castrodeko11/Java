package controle;

import java.util.Scanner;

public class WhileDeterminado {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;

		int indice = 0;
		while (indice < 3) {
			System.out.println("Digite sua nota: ");
			nota = read.nextDouble();
			somaDasNotas += nota;
			indice++;
		}
		read.close();
		System.out.printf("A média é %.2f", somaDasNotas / 3);
	}

}
