package doisCondicoes;

public class Sinais {

	public static void main(String[] args) {
		
		int numero1 = 10, numero2 = 15;
		boolean pergunta = false;
		
		System.out.print(numero1+numero2);
		System.out.print("    "+(numero1-numero2));
		System.out.print("    "+(numero1*numero2));
		System.out.println("    "+(numero1/numero2));
		
		if(pergunta) {
			System.out.println("A pergunta  é verdadeira");
		}
		//! sinal de negação
		if (!pergunta) {
		System.out.println("A pergunta é falsa");
		}
		// numero maior
		if(numero1 > numero2) {
			System.out.println("Numero1 é maior que numero2");
		}
		//numero menor
		if (numero1 < numero2) {
			System.out.println("Numero1 é menor que numero2");
		}
		//== sinal de igual
		if(numero1 == numero2) {
			System.out.println("Numero1 é igual numero2");
		}
		//!= sinal de diferente
		if(numero1 != numero2) {
			System.out.println("Numero1 é diferente do numero2");
		}
	}
}
