package br.com.treinamento;

public class EnhancedFor {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40};
	/*	
		for(int i : array) {
			System.out.println("Valor de i: " +i);
		}
	*/	
		
		int contador = 0;
		
		System.out.println("Lista de numeros: ");
		for(int i : array) {
			System.out.println(i);
			contador ++;
			
		}
		
		System.out.println("Quantidade de numeros: " +contador);
	}

}
