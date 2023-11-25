package br.com.treinamento.projeto.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Funcionario {

	
	public Funcionario(String nome, Integer registro) {
		this.nome = nome;
		this.registro = registro;
		System.out.println("Construtor da classe pai (Funcionario)");
	}

	//ATRIBUTOS

	@Getter @Setter
	private String nome;

	@Getter @Setter
	private Integer registro;
	
	public void mensagem() {
		System.out.println("Mensagem");
	}

}
