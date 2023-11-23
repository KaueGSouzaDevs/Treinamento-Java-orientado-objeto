package br.com.treinamento;

public class IfElseComposto {

	public static void main(String[] args) {

		int hora = 22;
		
		if(hora < 10) {
			System.out.println("Manhã");
		}else if(hora < 18) {
			System.out.println("Tarde");
		}else {
			System.out.println("Noite");
		}
		
		
	}

}
