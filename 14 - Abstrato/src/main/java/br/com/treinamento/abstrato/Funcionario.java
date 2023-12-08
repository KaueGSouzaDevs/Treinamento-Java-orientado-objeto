package br.com.treinamento.abstrato;

import lombok.Getter;
import lombok.Setter;

public abstract class Funcionario {

	// ATRIBUTOS
	@Getter
	@Setter
	private String nome;

	@Getter
	@Setter
	private Double salario;

	abstract Double calculoSalarioHoras();

	public Double getBonificacao() {
		return this.salario * 0.1;
	}

}
