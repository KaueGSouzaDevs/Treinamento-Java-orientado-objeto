package br.com.treinamento.mercado.model;

import lombok.Getter;
import lombok.Setter;

public class Cliente {
	
	// ATRIBUTOS
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String email;

	//CONSTRUTORES
	public Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	
	
	

}
