package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;

	String formatar() {
		return String.format("%d/%d/%d",dia,mes,ano);
	}
}
