package br.com.treinamento.abstrato;

import lombok.Getter;
import lombok.Setter;

public class Gerente extends Funcionario {

	// ATRIBUTOS
	@Getter
	@Setter
	private Integer diasTrabalhados;

	// MÉTODOS
	@Override
	Double calculoSalarioHoras() {

		Double salarioPorDia = this.getSalario() / this.diasTrabalhados;
		Double salarioPorHora = salarioPorDia / 8;

		return salarioPorHora;
	}

}
