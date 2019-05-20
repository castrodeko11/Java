package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	// Construtor Default
	Data() {
		
		this(1,1,2017);

	}

	// Construtor
//	Data(int d, int m, int a) {
//		dia = d;
//		mes = m;
//		ano = a;
//	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String formatar() {
		return String.format("%d/%d/%d", this.dia, mes, ano);
	}
}
