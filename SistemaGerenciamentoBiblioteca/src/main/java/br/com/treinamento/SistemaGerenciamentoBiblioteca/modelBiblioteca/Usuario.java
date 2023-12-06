package br.com.treinamento.SistemaGerenciamentoBiblioteca.modelBiblioteca;

public class Usuario extends Pessoa{

	//ATRIBUTOS
	private String email;
	private Integer telefone;
	
	//CONSTRUTOR
	public Usuario(String name, Integer idade, String email, Integer telefone) {
		super(name, idade);
		this.email = email;
		this.telefone = telefone;
	}

	//GGAS
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	
	
	

}
