package fundamentosExercicios;

import java.util.Scanner;
/**
 * 
 * @author Andr� Oliveira
 * 1. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
 *
 */

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
