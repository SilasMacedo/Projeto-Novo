package doisCondicoes;

public class IfcomPipe {

	public static void main(String[] args) {

		/**
		 * Trabalhando com pipe na condi��o (ou)
		 */
		
			String nome = "Valentina";
			int minhaIdade = 39;
			int idadePermitida = 21;
			boolean emancipado = true;

			
			if (minhaIdade >= idadePermitida || emancipado) {
				System.out.println("Voce pode tirar CNH, "+nome+".");
				
			}else {
				System.out.println("Voce ainda nao pode tirar CNH, "+nome+".");
			}
	}

}
