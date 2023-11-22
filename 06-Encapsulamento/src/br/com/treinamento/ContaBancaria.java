package br.com.treinamento;

public class ContaBancaria {
	
	private String agencia;
	private int numeroConta;
	private double saldo;
	private Cliente titular;


// GETTER AND SETTER.
	
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	
	
// FUNÇÕES.
	
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
