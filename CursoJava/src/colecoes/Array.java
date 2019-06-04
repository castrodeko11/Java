package colecoes;

public class Array {
	public static void main(String[] args) {
		double[] notasJoao = {7.0,8.7,6.2,4.9,9.7};
		
		double[] notasPedro = new double [5]; // Array tamanho fixo
		notasPedro [0] = 7.0;
		notasPedro [1] = 8.7;
		notasPedro [2] = 6.2;
		notasPedro [3] = 4.9;
		notasPedro [4] = 9.7;
//		notasPedro [5] = 9.7;
		
		double totalJoao  = 0;
		for (double nota: notasJoao) { //For Echa, irá passar por cadas elemento e oaramentro é inserido na variável nota.
			totalJoao += nota;
		}
//		for (int i = 0; i < notasJoao.length;i++) {
//			totalJoao += notasJoao[i];
//		}
		
		double totalPedro  = 0;
		for (double nota: notasPedro) {
			totalPedro += nota;
		}
//		for (int i = 0; i < notasPedro.length;i++) {
//			totalPedro += notasPedro[i];
//		}
		
		System.out.println("Média João: " + totalJoao/notasJoao.length);
		System.out.println("Média Pedro: " + totalPedro/notasPedro.length);
		
	}

}
