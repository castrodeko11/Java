package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Filha extends Sogra {
	
	String segredoDoCasal = "Meu marido est� quase sendo demitido";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais n�o sabem..." + euMesma.segredoDoCasal);
		System.out.println(euMesma.segredoDeFamilia); // Recebeu da heran�a da classe Sogra/M�e
		
//		Genro meuAmor = new Genro ();
//		System.out.println(meuAmor.Segredo);
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);
		
//		Sogra mamae = new Sogra();
//		System.out.println(mamae.segredoDeFamilia);
		
	}

}
