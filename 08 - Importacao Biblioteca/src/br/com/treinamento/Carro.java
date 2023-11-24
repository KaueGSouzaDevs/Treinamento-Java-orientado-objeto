package br.com.treinamento;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Carro {
	
	// ATRIBUTOS
	
	
	@Getter @Setter
	private String modelo;
	
	@Getter @Setter
	private String marca;
	
	@Getter @Setter
	private String motor;
	
	@Getter @Setter
	private String cor;
	
	@Getter @Setter
	private String combustivel;
	
	@Getter @Setter
	private Integer anoFabricacao;
	
	
}
