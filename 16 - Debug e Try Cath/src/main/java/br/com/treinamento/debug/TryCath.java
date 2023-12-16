package br.com.treinamento.debug;

public class TryCath {

	public static void main(String[] args) {

		String frase = "Olá, sou a frase 1";
		String novaFrase = "Olá, sou a frase 2";
		
		
		try {
		
			frase = frase.toUpperCase();
			novaFrase = novaFrase.toLowerCase();
			
			System.out.println("Frase: "+frase);
			System.out.println("Nova frase: "+novaFrase);
			
		} catch (Exception e) {
			
			System.out.println("Não foi possível converter as frases.");
			System.out.println("Motivo: "+e);
			
		} finally {
			
			System.out.println("\nSempre exetuco esse bloco.");
			
		}
		
		
	}

}
