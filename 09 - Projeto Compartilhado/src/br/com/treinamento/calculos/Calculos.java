package br.com.treinamento.calculos;

public class Calculos {
	
	public static Integer somarDoisNumeros(Integer numero1, Integer numero2) {
		return numero1+numero2;
	}

	public static Double calculaCircunferencia(Integer diametro) {
		Double pi=3.14159265;
		return diametro*pi;
	}
	
	public static Integer calculaAreaQuadrado(Integer base, Integer altura) {
		return base*altura;
	}
}
