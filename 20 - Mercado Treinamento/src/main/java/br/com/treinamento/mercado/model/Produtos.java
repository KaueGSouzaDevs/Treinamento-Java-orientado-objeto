package br.com.treinamento.mercado.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class Produtos {
	
	// Atributos
	@Getter @Setter
	private String nome;
	@Getter @Setter
	private BigDecimal preco;
	
	// Construtores
	public Produtos(String nome, BigDecimal preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	

}
