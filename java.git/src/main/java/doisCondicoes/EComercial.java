package doisCondicoes;

public class EComercial {

	public static void main(String[] args) {
		
		double mediaPassar = 7;
		double nota1 = 9;
		double nota2 = 9;
		double nota3 = 9;
		double media = (nota1+nota2+nota3)/3;
		boolean falta = true;
		boolean comportamento = false;
				
// If usando e comercial & na condição
		
		if(media >= mediaPassar && falta && comportamento) {
			System.out.println("Aluno aprovado. Media: " +media);
		}else {
			System.out.println("Aluno reprovado. Média: " +media);
		}
	}
}
