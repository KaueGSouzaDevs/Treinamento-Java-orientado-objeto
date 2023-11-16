package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		
		pessoa.nome = "Kauê Gallego de Souza";
		pessoa.idade = 20;
		pessoa.peso = 79.00;
		pessoa.altura = 1.84;
				
		Pessoa pessoa2 = new Pessoa();
				
		System.out.println(pessoa2.nome);
		
		pessoa2.nome = "Pedro da Silva Junior";
		
		System.out.println(pessoa.nome);
		System.out.println(pessoa2.nome);
		
		
	}

}
