package controleExercicios;
import java.util.Scanner;

/**
 * 
 * @author André Oliveira
 * 8. Criar um programa que receba uma palavra e imprime no console letra por letra.
 */

public class Ex08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String l;		
				
		System.out.printf("Digite uma palavra: ");
		l = scanner.nextLine();
		char ch; 
		
		for (int i =0; l.length()>i; i++) {
			
			
			System.out.println(l.charAt(i));
					
			
		}
		
		scanner.close();
		
	}

}
