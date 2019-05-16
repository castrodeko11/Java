package fundamentosExercicios;

import java.util.Scanner;

/**
 * 
 * @author André Oliveira
 * 5. Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
 * 
 *
 */

public class Ex5 {
	public static void main(String[] args) {
		double h = (double) 0;
		double b = (double) 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe o seu altura do triângulo: ");
		h = ler.nextFloat();
		System.out.printf("Informe a base do triângulo: ");
		b = ler.nextFloat();
		

			
		System.out.println();
		System.out.printf("A área do triângulo é: " + (b*h)/2 + "m²");
	}

}
