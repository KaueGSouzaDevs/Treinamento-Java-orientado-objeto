package br.com.treinamento;

public class PrincipalCarro {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		
		carro1.ano = 2005;
		carro1.cor = "Prata";
		carro1.marca = "Ford";
		carro1.modelo = "Fiesta";
		
		System.out.println("Modelo do carro: "+carro1.modelo);
		carro1.ligar();
		carro1.mostrarIdade();
		carro1.buzinar("Biiii-biii");
		carro1.desligar();
		
	}

}
