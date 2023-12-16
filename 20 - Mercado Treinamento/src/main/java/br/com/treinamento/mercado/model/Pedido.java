package br.com.treinamento.mercado.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Pedido {
	
	// Atributos
	@Getter @Setter
	private Cliente cliente;
	@Getter @Setter
	private List<Produtos> produtoList = new ArrayList<Produtos>();
	@Getter @Setter
	private BigDecimal total;
	
	// Construtor
	public Pedido(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void insereProduto() {
		
		
	}
	
	
	
	

}
