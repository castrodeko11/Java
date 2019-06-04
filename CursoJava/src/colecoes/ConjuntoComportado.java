package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		Set <String> aprovados = new TreeSet<>(); // new HashSet<String>(); -> opcional, compreende que só terá string.
//		Set <String> aprovados =  new LinkedHashSet<>();	LinkedHashSet -> Ordem de inserção da informação
//		Set <String> aprovados =  new TreeSet<>();	TreeSet -> Ordem Alfética ou Ordenada	 		
//		Set <String> aprovados =  new HashSet<>(); HashSet -> Sem ordem de inserção 
		
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
//		aprovados.add(1); -> Apenas String
		
		for (String nome: aprovados) {
			System.out.println(nome);
			
		}
		
	}

}
