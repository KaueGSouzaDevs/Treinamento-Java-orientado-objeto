package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		cliente1.nome = "Kaue";
		cliente1.cfp = "123456789";
		
		ContaBancaria conta1 = new ContaBancaria();
		conta1.agencia = "777-9";
		conta1.numeroConta = 456987;
		conta1.saldo = 100.99;
		
		
	}

}
