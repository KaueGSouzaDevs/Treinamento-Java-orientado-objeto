package br.com.treinamento.SistemaGerenciamentoBiblioteca.modelBiblioteca;

import lombok.Getter;

public class Pessoa {
	
	// ATRIBUTOS
	@Getter
	private String name;	
	@Getter
	private Integer idade;
	
	
	public Pessoa(String name, Integer idade) {
		super();
		this.name = name;
		this.idade = idade;
	}

	
	
}
