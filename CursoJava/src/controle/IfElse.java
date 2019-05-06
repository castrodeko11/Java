package controle;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		double nota;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite sua nota: ");
		nota = ler.nextDouble();
		
		if(nota >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Recuperação");
		}
	}

}
