package br.com.treinamento.SistemaGerenciamentoBiblioteca.modelBiblioteca;

public class Livro {
	
	
	//ATRIBUTOS
	private String titulo;
	private String autor;
	private String emprestado;
	
	//CONSTRUTORES
	public Livro(String titulo, String autor, String emprestado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.emprestado = emprestado;
	}
	
	//GGAS	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEmprestado() {
		return emprestado;
	}

	public void setEmprestado(String emprestado) {
		this.emprestado = emprestado;
	}

	public String Emprestar() {
		if (emprestado == "false") {
			emprestado = "true";
			
		} else {
			System.out.println("Livro indisponivel.");
		}
		return ("Livro emprestado com sucesso.");
	}
	
	public String Devolver(){
		if(emprestado == "true") {
			emprestado = "false";
		}else {
			System.out.println("Este livro ja foi devolvido.");
		}
		return ("Livro devolvido com sucesso");
	}
	
	
	
	
}




