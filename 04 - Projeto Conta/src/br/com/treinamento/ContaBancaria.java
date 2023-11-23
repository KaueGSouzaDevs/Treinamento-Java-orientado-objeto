package br.com.treinamento;

public class ContaBancaria {
	
	String agencia;
	int numeroConta;
	double saldo;
	Cliente titular;

	
	void transferir(ContaBancaria contaDestino, double valor) {
		
		if(saldo<valor) {
			System.out.println("\nSaldo insuficiente.");
		} else {
			saldo = saldo-valor;
			contaDestino.saldo = contaDestino.saldo+valor;
			System.out.println("\nTransferencia realizada com sucesso.");
		}
		
		
	}
	
	void sacar(double valor) {
		saldo = saldo-valor;
		
		System.out.println("Saque de: R$"+valor+" efetuado com sucesso..\n");
		
		
	}
	
	void depositar(double valor) {
		
		saldo = saldo+valor;
		
		System.out.println("Depósito de : R$"+valor+" efetuado com successo.\n");
		
		
	}
	
}
