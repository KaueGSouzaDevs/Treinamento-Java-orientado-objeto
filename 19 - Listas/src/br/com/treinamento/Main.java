package br.com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Kaue", 20);
		Pessoa pessoa2 = new Pessoa("Pedro", 21);
		Pessoa pessoa3 = new Pessoa("Ailton", 23);
		Pessoa pessoa4 = new Pessoa("Kaua", 19);

		List<Pessoa> bancoPessoas = new ArrayList<Pessoa>();
		bancoPessoas.add(pessoa1);
		bancoPessoas.add(pessoa2);
		bancoPessoas.add(pessoa3);
		bancoPessoas.add(pessoa4);


		//For simples
		
		/*
		for (int i = 0; i < bancoPessoas.size(); i++) {
			
			Pessoa pessoa = bancoPessoas.get(i);
			
			System.out.println(pessoa.getNome()+"-"+ pessoa.getIdade());
		}
		*/

		// Enhanced For
		
		/*
		for (Pessoa pessoa : bancoPessoas) {
			System.out.println(pessoa.getNome()+"-"+ pessoa.getIdade());
		}
		*/
		
		// Lâmbida
		bancoPessoas.forEach(p -> System.out.println(p.getNome()));
		
		
		
	}

}
