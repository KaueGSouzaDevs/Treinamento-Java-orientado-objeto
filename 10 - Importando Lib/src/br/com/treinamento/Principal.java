package br.com.treinamento;

import br.com.treinamento.calculos.Calculos;

public class Principal {

	public static void main(String[] args) {

		Double circunferencia = Calculos.calculaCircunferencia(19);
		
		System.out.println("A circunferencia é: "+circunferencia);
		
	}

}
