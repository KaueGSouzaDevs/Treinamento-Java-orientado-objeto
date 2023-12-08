package br.com.treinamento.interfaces;

public class Carro implements Veiculo {

	// MÉTODOS
	@Override
	public void liga() {
		System.out.println("Ligou o carro. ");
	}

	@Override
	public Integer velocidadeMaxima() {
		return 190;
	}

	@Override
	public void buzina() {
		System.out.println("bii-biiiiiiiii");

	}

}
