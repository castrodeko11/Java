package classe;

public class Funcionario {
	String nome;
	String funcao;
	double salario;

	
	// Construtor
	Funcionario(String n, String f,double s) {
		nome = n;
		funcao = f;
		salario = s;
	}

	String formatarFuncionario() {
		return String.format("Seu nome �: " + nome + "\n" +  "Seu Cargo �: " + funcao + "\n" + "Seu Sal�rio �: " + salario);
	}
}
