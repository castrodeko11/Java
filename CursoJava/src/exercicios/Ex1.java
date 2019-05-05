package exercicios;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		float celsius = 0;
		Scanner ler = new Scanner(System.in);

		System.out.printf("Informe a temperatura em celsius para conversão: ");
		celsius = ler.nextFloat();

		System.out.println("Conversão da temperatura fahrenheit: " + (32 + (celsius * 9 / 5)) + " ºF");
		
		ler.close();

	}

}
