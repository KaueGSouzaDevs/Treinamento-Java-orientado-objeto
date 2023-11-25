package br.com.treinamento.projeto;

import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.treinamento.projeto.model.Funcionario;
import br.com.treinamento.projeto.model.Gerente;

public class App {
	public static void main(String[] args) {

		/*
		 * Formatter formatador = new CPFFormatter(); String cpf =
		 * formatador.format("52589131801"); System.out.println(cpf);
		 */

		Gerente gerente = new Gerente("Pedro", 666);
		
		gerente.setSalario(5922.99);

		System.out.println(gerente);
	}
}
