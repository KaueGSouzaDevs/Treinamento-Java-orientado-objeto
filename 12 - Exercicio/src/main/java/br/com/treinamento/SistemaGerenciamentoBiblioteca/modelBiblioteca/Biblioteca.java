package br.com.treinamento.SistemaGerenciamentoBiblioteca.modelBiblioteca;

import lombok.Getter;
import lombok.Setter;

public class Biblioteca {
	
	//ATRIBUTOS
	@Getter @Setter
	private Usuario usuariosBiblioteca;
	@Getter @Setter
	private Livro livrosBiblioteca;

}
