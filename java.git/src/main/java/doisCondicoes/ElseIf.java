package doisCondicoes;

import java.text.NumberFormat;

public class ElseIf {

	public static void main(String[] args) {
		
		boolean dinheiro = true;
		boolean credito = true;
		boolean boleto = true;
		int preco = 100000;		
		NumberFormat valor = NumberFormat.getCurrencyInstance();
		
		System.out.println("******************************************");
		System.out.println("============ Loja de carros ==============");
		System.out.println("******************************************");
		
		if(dinheiro){
			int desconto = 6000;
			preco = preco - desconto;
			
			System.out.println("Parabens pela compra do carro em dinheiro no valor R$ " +valor.format(preco));
			
		}else if (credito) {
			int juros = 2000;
			preco += juros;
			
			System.out.println("Parabens pela compra do carro no credito no valor R$ " +valor.format(preco));
		}else if (boleto) {
			int taxa = 500;
			preco += taxa;
			
			System.out.println("Parabens pela compra do carro no credito no valor R$ " +valor.format(preco));
		} else {
			System.out.println("Forma de pagamento nao aceito");
		}

	}

}
