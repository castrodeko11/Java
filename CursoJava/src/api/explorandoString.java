package api;

public class explorandoString {
	
	public static void main(String[] args) {
		String nome = new String ("Andr�");
		nome = "And"  + "r�";
		
		// Alguns m�todos
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0,3));
		System.out.println(nome.indexOf("d"));
		System.out.println(nome.charAt(2));
		System.out.println(nome.equalsIgnoreCase("anDr�"));
		System.out.println(nome.startsWith("And"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" � legal").concat("!"));
		
		// Astring � imut�vel
		System.out.println(nome);
		
		nome = nome.toUpperCase().substring(0,3).concat(" � Legal");
		System.out.println(nome);
	}	

}
