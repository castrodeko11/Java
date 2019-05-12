package controle;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somasDasNotas = 0;
		double nota = 0;
		
		
		for (int indice = 0;indice < 3;indice++) {
			System.out.printf("Digite sua nota: ");
			nota = scanner.nextDouble();
			somasDasNotas +=nota;
			
		}
		
		scanner.close();
		System.out.printf("A média é %.2f", somasDasNotas / 3);
	}

}
