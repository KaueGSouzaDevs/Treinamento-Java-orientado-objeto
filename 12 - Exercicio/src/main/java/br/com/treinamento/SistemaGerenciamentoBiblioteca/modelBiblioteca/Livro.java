package br.com.treinamento.SistemaGerenciamentoBiblioteca.modelBiblioteca;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Livro {
	
	
	//ATRIBUTOS
	@Getter
	private String titulo;
	@Getter
	private String autor;
	@Getter
	private Boolean emprestado;
	
	//CONSTRUTORES
	public Livro(String titulo, String autor, Boolean emprestado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.emprestado = emprestado;
	}
	
	public void emprestar() {
		this.emprestado = true;
	}
	
	public void devolver() {
		this.emprestado = false;
	}
	
}




