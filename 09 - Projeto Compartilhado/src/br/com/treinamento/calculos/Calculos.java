package br.com.treinamento.calculos;

/**
 * 
 * Essa classe é reponsável por fornecer diversas formulas
 * de cálculos que pode ser utilizadas em vários projetos.<br>
 * <b>A classe não possui atributos e os métodos são todos estáticos.</b>
 * Veja mais informações em: <a href="https://github.com/KaueGSouzaDevs"> LINK </a> 
 * 
 */

public class Calculos {
	
	/**
	 * <b>Método para somar dois números distintos.</b>
	 * @param numero1 Recebe o primeiro número para o cálculo.
	 * @param numero2 Recebe o segundo número para o cálculo.
	 * @return
	 * @author Gallego
	 * @since v1
	 */
	
	public static Integer somarDoisNumeros(Integer numero1, Integer numero2) {
		return numero1+numero2;
	}

	/**
	 * <b>Cálcula o perímetro a partir de um diametro.</b>
	 * @param diametro Recebe o valor do diametro.
	 * @return Retorna o perímetro da circunferencia.
	 * @author Gallego
	 * @since v1
	 */
	public static Double calculaCircunferencia(Integer diametro) {
		Double pi=3.14159265;
		return diametro*pi;
	}
	
	/**
	 * <b>Cálcula área de um quadrado com a base e altura.</b>
	 * @param base Recebe o valor da base do quadrado.
	 * @param altura Recebe o valor da altura do quadrado.
	 * @return Retorna a área do quadrado.
	 * @author Gallego
	 * @since v1
	 */
	public static Integer calculaAreaQuadrado(Integer base, Integer altura) {
		return base*altura;
	}
}
