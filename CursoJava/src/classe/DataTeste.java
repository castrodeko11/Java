package classe;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Data nascimento = new Data();
		Data casamento = new Data(20, 05, 1985);

//		System.out.println("Status da sua Fomra��o \n");
//		System.out.printf("Digite a dia da sua forma��o: ");
//		nascimento.dia = scanner.nextInt();
//
//		System.out.printf("Digite a m�s da sua forma��o: ");
//		nascimento.mes = scanner.nextInt();
//
//		System.out.printf("Digite a ano da sua forma��o: ");
//		nascimento.ano = scanner.nextInt();

		System.out.println("\nData completa da Fomra��o\n ");
		System.out.println("A data da sua Forma��o �: " + nascimento.formatar());
		System.out.println("A data da sua Forma��o �: " + casamento.formatar());
//		System.out.println(nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano);
//		System.out.printf("%d/%d/%d",nascimento.dia,nascimento.mes,nascimento.ano);

		scanner.close();
	}

}
