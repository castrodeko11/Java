package classe;

import java.util.Scanner;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite o Primeiro N�mero: ");
		double a = scanner.nextDouble();
		
		System.out.printf("Digite o Segundo N�mero: ");
		double b = scanner.nextDouble();
		
		System.out.printf("A soma �: " + calc.somar(a, b));
		
		// Acrescentar valor
		System.out.println();
		System.out.printf("Digite o Acr�scimo de valor");
		calc.acrescentar(scanner.nextDouble());
		System.out.println("Resultado ap�s o Acr�simo de valor: " +calc.obterResultado());
		
		calc.limpar();
		System.out.println(calc.obterResultado());
		
		scanner.close();
		
	}

}
