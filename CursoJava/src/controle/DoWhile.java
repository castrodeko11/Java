package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double SomaDasNotas = 0;
		double nota =0;
		int numeroDeNotas = 0;
		
		do {
			System.out.println("Digite sua Nota: ");
			nota = scanner.nextDouble();
			if (nota <=10 && nota >=0) {
				SomaDasNotas += nota;
				numeroDeNotas++;
			}
			
		}while (nota !=-1);
		scanner.close();
		System.out.printf("A média é %.2f", SomaDasNotas/numeroDeNotas);

	}
}
