package fundamentosExercicios;

import java.util.Scanner;

/**
 * 
 * @author Andr� Oliveira
 * 4. Criar um programa que leia um valor e
 * apresente os resultados ao quadrado e ao cubo do valor.
 *
 */

public class Ex4 {
	public static void main(String[] args) {
		double n = (double) 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um num�ro: ");
		n = ler.nextDouble();
		
		System.out.println("----------");
		System.out.println("Infomra��o");
		
		System.out.println("Quadrado do N�mero "+ n + " �: " +  Math.pow(n,2) );
		System.out.println("Cubo do N�mero "+ n + " �: " +  Math.pow(n,3) );
	}
}
