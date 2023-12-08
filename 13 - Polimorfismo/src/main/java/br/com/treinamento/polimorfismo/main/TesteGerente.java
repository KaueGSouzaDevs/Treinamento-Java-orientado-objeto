package br.com.treinamento.polimorfismo.main;

import br.com.treinamento.polimorfismo.model.Gerente;

public class TesteGerente {

	public static void main(String[] args) {

		Gerente gerente1 = new Gerente();
		gerente1.setNome("kaue");
		gerente1.setSalario(1999.00);
		
		System.out.println("Bonificação do gerente: "+ gerente1.getBonificacao());
		
		System.out.println("A senha está correta? "+gerente1.autentica(123));
	}

}
