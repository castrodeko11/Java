package exercicios;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		float celsius = 0;
		Scanner ler = new Scanner(System.in);

		System.out.printf("Informe a temperatura em celsius para convers�o: ");
		celsius = ler.nextFloat();

		System.out.println("Convers�o da temperatura fahrenheit: " + (32 + (celsius * 9 / 5)) + " �F");
		
		ler.close();

	}

}
