package br.com.treinamento.SistemaGerenciamentoBiblioteca;

import br.com.treinamento.SistemaGerenciamentoBiblioteca.modelBiblioteca.Biblioteca;
import br.com.treinamento.SistemaGerenciamentoBiblioteca.modelBiblioteca.Livro;
import br.com.treinamento.SistemaGerenciamentoBiblioteca.modelBiblioteca.Usuario;


public class App 
{
    public static void main( String[] args )
    {
    	Usuario usuario1 = new Usuario("Kauê Gallego de Souza", 20, "kauegallegodesouza@gmail.com", 955502170);
    	Livro livro1 = new Livro("Os Piratas do Caribe.", "Jerry Bruckheimer", "false");
    	
    	
    	Biblioteca biblioteca = new Biblioteca();
    	biblioteca.setLivrosBiblioteca(livro1);
    	biblioteca.setUsuariosBiblioteca(usuario1);
    	
    	System.out.println(livro1.Emprestar());
    	System.out.println(livro1.Emprestar());
    	
    	

    				

    	
    	
    	
    	
    	
    	
    }

    
}
