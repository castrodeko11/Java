package api;

public class explorandoString {
	
	public static void main(String[] args) {
		String nome = new String ("André");
		nome = "And"  + "ré";
		
		// Alguns métodos
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0,3));
		System.out.println(nome.indexOf("d"));
		System.out.println(nome.charAt(2));
		System.out.println(nome.equalsIgnoreCase("anDré"));
		System.out.println(nome.startsWith("And"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" é legal").concat("!"));
		
		// Astring é imutável
		System.out.println(nome);
		
		nome = nome.toUpperCase().substring(0,3).concat(" é Legal");
		System.out.println(nome);
	}	

}
