package fundamentosExercicios;

import java.util.Scanner;

/**
 * 
 * @author Andr� Oliveira
 * 2. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius
 *
 */

public class Ex2 {
	public static void main(String[] args) {

		float fht = (float) 0;
		Scanner ler = new Scanner(System.in);

		System.out.printf("Informe a temperatura em fahrenheit para convers�o: ");
		fht = ler.nextFloat();

		System.out.println("Convers�o da temperatura celsius: " + (5 / 9 * (fht - 32)) + " �C");
		
		
		ler.close();

	}
}