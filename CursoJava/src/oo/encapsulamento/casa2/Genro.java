package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogro;

public class Genro {

	private String segredo = "Minha Sogra é Legal";

	public static void main(String[] args) {
		Genro euMesmo = new Genro();

		System.out.println("Numca falarei..." + euMesmo.segredo);

		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal);

		Sogro sograo = new Sogro();
		System.out.println(sograo.gostaDeCerveja);

//		Sogro sogrinha = new Sogra();
//		System.out.println(sogrinha.segredoDeFamilia);
	}

}
