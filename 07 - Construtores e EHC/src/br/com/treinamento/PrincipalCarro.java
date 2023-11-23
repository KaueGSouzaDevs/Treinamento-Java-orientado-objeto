package br.com.treinamento;

public class PrincipalCarro {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("VW", "VOYAGE", 2010);
		System.out.println("Nome do carro: "+carro1.getNome());
			
		
		Carro carro2 = new Carro(1989);
		System.out.println("\nIdade do carro: "+ carro2.idadeCarro());
		
		System.out.println(carro1);
		
	
	}

}
