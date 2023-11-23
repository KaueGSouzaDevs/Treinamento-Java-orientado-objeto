package br.com.treinamento;

public class Carro {
	
	

	//Atributos
	private String marca;
	private String nome;
	private Integer anoFabricacao;
	
	
	//Construtores
	public Carro(String marca, String nome, Integer anoFabricacao) {
		this.marca = marca;
		this.nome = nome;
		this.anoFabricacao = anoFabricacao;
	}
	
	public Carro(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	
	//Metodo idade carro
	 public Integer idadeCarro() {
		 return (2023-anoFabricacao);		
	}


	 //Getters
	public String getMarca() {
		return marca;
	}
	public String getNome() {
		return nome;
	}
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	
	//ToString
	public String toString() {
		return "Carro \nmarca =" + marca + "\nnome =" + nome + "\nanoFabricacao =" + anoFabricacao;
	}
	
	
	
}
