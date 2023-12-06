package br.com.treinamento.SistemaGerenciamentoBiblioteca.modelBiblioteca;

public class Pessoa {
	
	// ATRIBUTOS
	private String name;
	private Integer idade;
	
	
	//GGAS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	 
	//CONSTRUTOR
	public Pessoa(String name, Integer idade) {
		this.name = name;
		this.idade = idade;
	}
	
}
