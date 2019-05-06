package controle;

import java.util.Scanner;

public class WhileInderterminado {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		float somaDasNotas = 0;
		float nota = 0;
		float numeroDeNotas = 0;
		
		while (nota != -1) {
			System.out.printf("Digite sua nota: ");
//			nota = Float.parseFloat(read.next());
			String snota = read.next();
			if (snota.contains(",")) {
				snota = snota.replace(",", ".");
			} 
			nota = Float.parseFloat(snota);
			
			if (nota <=10 && nota >= 0) {
				somaDasNotas += nota;
				numeroDeNotas++;
			}
			
		}
		
		read.close();
		System.out.printf("A média é %.2f",somaDasNotas/numeroDeNotas);
		
		
	}

}
