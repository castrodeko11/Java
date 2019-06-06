package oo.polimorfismo;

public class Pessoa {
	
	/**
	 * Peso em KG
	 */
	private double peso = 0;
	
	public Pessoa (double pesoInicial) {
		this.peso = pesoInicial;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
//	public void comer(Arroz arroz) {
//		this.peso += arroz.getPeso();
//	}
//	
//	public void comer(Feijao feijao) {
//		this.peso += feijao.getPeso();
//	}
//	
//	public void comer(Sorvete sorvete) {
//		this.peso += sorvete.getPeso();
//	}

}
