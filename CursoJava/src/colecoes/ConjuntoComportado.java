package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		Set <String> aprovados = new TreeSet<>(); // new HashSet<String>(); -> opcional, compreende que s� ter� string.
//		Set <String> aprovados =  new LinkedHashSet<>();	LinkedHashSet -> Ordem de inser��o da informa��o
//		Set <String> aprovados =  new TreeSet<>();	TreeSet -> Ordem Alf�tica ou Ordenada	 		
//		Set <String> aprovados =  new HashSet<>(); HashSet -> Sem ordem de inser��o 
		
		aprovados.add("Jo�o");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
//		aprovados.add(1); -> Apenas String
		
		for (String nome: aprovados) {
			System.out.println(nome);
			
		}
		
	}

}
