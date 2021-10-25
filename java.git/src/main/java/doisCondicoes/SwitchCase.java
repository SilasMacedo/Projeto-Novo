package doisCondicoes;

public class SwitchCase {

	public static void main(String[] args) {
	
		/**
		 *  op��es de pagamentos
		 *  1 a vista | 2 cr�dito | 3 Boleto
		 */
		int opcao = 2;
		
		double valorProduto = 5.000;
		double saldoCliente = 10.000;
		double limiteCartao = 2.000;
		
		switch(opcao) {
		
		case 1:
			System.out.println("Voce escolheu a op��o de pagamento em dinherio");
			if(saldoCliente >= valorProduto) {
				System.out.println("Compra realizada com sucesso.");
			}else {
				System.out.println("Compra NEGADA, procure seu banco");
			}
			break;
		
		case 2:
			System.out.println("Voce escolheu a op��o de pagamento no cart�o de cr�dito");
			if(limiteCartao >= valorProduto) {
				System.out.println("Compra realizada com sucesso.");
			}else {
				System.out.println("Compra NEGADA, consulte seu banco.");
			}
			break;
		case 3:
			System.out.println("Voce escolheu a op��o de paragmento no boleto.");
			if (saldoCliente >= valorProduto) {
				System.out.println("Compra realizada com sucesso.");
			}else {
				System.out.println("Compra NEGADA, verifique seu saldo.");
			}
			break;
		default:
			System.out.println("Op��o invalida");
			break;
		}
	}
}
