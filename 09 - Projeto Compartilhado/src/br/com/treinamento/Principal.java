package br.com.treinamento;

import br.com.treinamento.calculos.Calculos;
import br.com.treinamento.utilitarios.AuxiliarString;

public class Principal {

	public static void main(String[] args) {

		Integer area = Calculos.calculaAreaQuadrado(35, 15);
		
		System.out.println(area);
		
		
		String cpf = AuxiliarString.removePontuacao("525.891.318-01");
		
		System.out.println("\n"+cpf);
	}

}
