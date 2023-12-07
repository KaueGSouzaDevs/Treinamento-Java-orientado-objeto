package br.com.treinamento.SistemaGerenciamentoBiblioteca.modelBiblioteca;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Usuario extends Pessoa{

	//ATRIBUTOS
	@Getter
	private String email;
	@Getter
	private String telefone;
	
	//CONSTRUTOR
	public Usuario(String name, Integer idade, String email, String telefone) {
		super(name, idade);
		this.email = email;
		this.telefone = telefone;
	}

}
