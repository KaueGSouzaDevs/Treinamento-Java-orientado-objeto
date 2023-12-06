package br.com.treinamento.SistemaGerenciamentoBiblioteca.modelBiblioteca;

public class Biblioteca {
	
	//ATRIBUTOS
	private Usuario usuariosBiblioteca;
	private Livro livrosBiblioteca;

	//GGAS
	public Usuario getUsuariosBiblioteca() {
		return usuariosBiblioteca;
	}
	public void setUsuariosBiblioteca(Usuario usuariosBiblioteca) {
		this.usuariosBiblioteca = usuariosBiblioteca;
	}
	public Livro getLivrosBiblioteca() {
		return livrosBiblioteca;
	}
	public void setLivrosBiblioteca(Livro livrosBiblioteca) {
		this.livrosBiblioteca = livrosBiblioteca;
	}
	
	
	
	

}
