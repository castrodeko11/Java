package exercicios;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		double peso = 0;
		double altura = 0;
		double imc = 0;
		Scanner ler = new Scanner(System.in);

		System.out.printf("Informe o seu Peso: ");
		peso = ler.nextFloat();

		System.out.println();

		System.out.printf("Informe o sua altura: ");
		altura = ler.nextFloat();
		
		
		imc = peso / ( altura * altura );
		
		System.out.print("IMC: " + imc);
		
		
		ler.close();

	}
}
