package br.com.treinamento;

public class Principal {
	
	public static void main(String[] args) {
		
		
		// Primeiro Objeto
		Pessoa pessoaA = new Pessoa();
		pessoaA.setNome("Kauê");
		pessoaA.setIdade(20);
		
		// Segundo Objeto
		Pessoa pessoaB = new Pessoa();
		pessoaB.setNome("Kauê");
		pessoaB.setIdade(20);
		
		
		System.out.println("Pessoa A é igual a pessoa B? "+ (pessoaA==pessoaB)); //false
		System.out.println("Pessoa a é igual a pessoa B? "+ pessoaA.equals(pessoaB)); //true
		System.out.println("Hash pessoa A: "+ pessoaA.hashCode()); //2332984
		System.out.println("Hash pessoa B: "+ pessoaA.hashCode()); //2332984
		
		
	}

}
