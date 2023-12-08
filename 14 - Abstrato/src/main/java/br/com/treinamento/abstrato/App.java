package br.com.treinamento.abstrato;

public class App {

	public static void main(String[] args) {

		// ESTANCIAMENTO
		Gerente gerente = new Gerente();
		gerente.setNome("Marcela");
		gerente.setDiasTrabalhados(22);
		gerente.setSalario(15000.00);

		System.out.println("O valor salário hora é: " + gerente.calculoSalarioHoras());

	}
}
