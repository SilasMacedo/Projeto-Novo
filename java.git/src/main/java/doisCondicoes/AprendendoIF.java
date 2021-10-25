package doisCondicoes;

public class AprendendoIF {
	
	public static void main(String[] args) {
	
		System.out.println("---------- Usando If ----------\n");
		
		int idadePermitida = 18;
		int minhaIdade = 39;
		
		if (minhaIdade >= idadePermitida) {
			System.out.println("Permitido tirar CNH, sua idade é: " +minhaIdade+"\n");
		}else {
			System.out.println("Não é permitido tirar CNH, sua idade é: " +minhaIdade+"\n");
		}
		System.out.println("---------- Usando If com calculo ----------\n");
	
	//if com calculo
	
	int mediaPassar = 9;
	int nota1 = 9;
	int nota2 = 10;
	int nota3 = 9;
	int media = (nota1+nota2+nota3) / 3;
	
	if (media >= mediaPassar) {
		System.out.println("Parabens voce passou de ano. Sua media foi: "+ media);
	}else {
		System.out.println("Infelizmente voce nao atingiu a media. Tente novamento no proximo ano.");
		}
	}

}


	


