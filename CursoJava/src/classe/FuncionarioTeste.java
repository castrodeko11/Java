package classe;

public class FuncionarioTeste {
	public static void main(String[] args) {

		Funcionario estag = new Funcionario("Andr�","Sistemas",5000.00);
//		estag.nome = "Leandro Garcia";
//		estag.salario = 2500.00;
//		estag.funcao = "Dev";

//		System.out.println("Informa��es Funcion�rio: \n" + estag.nome + "\n" + estag.salario + "\n" + estag.funcao);
		System.out.println(estag.formatarFuncionario());



	}

}
