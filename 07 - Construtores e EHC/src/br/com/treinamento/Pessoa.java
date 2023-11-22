package br.com.treinamento;

import java.util.Objects;

public class Pessoa {
	
	//Atributos
	private String nome;
	private int idade;
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//HashCode
	public int hashCode() {
		return Objects.hash(idade, nome);
	}

	//Equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return idade == other.idade && Objects.equals(nome, other.nome);
	}
	
	
	

}
