package fundamentosExercicios;

import java.util.Scanner;

/**
 * 
 * @author Andr� Oliveira
 * 5. Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea.
 * 
 *
 */

public class Ex5 {
	public static void main(String[] args) {
		double h = (double) 0;
		double b = (double) 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe o seu altura do tri�ngulo: ");
		h = ler.nextFloat();
		System.out.printf("Informe a base do tri�ngulo: ");
		b = ler.nextFloat();
		

			
		System.out.println();
		System.out.printf("A �rea do tri�ngulo �: " + (b*h)/2 + "m�");
	}

}
