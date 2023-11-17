package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		cliente1.nome = "Kaue";
		cliente1.cfp = "123456789";

		ContaBancaria conta1 = new ContaBancaria();
		conta1.agencia = "777-9";
		conta1.numeroConta = 456987;
		conta1.saldo = 100.00;

		// ********************************************\\

		Cliente cliente2 = new Cliente();
		cliente2.nome = "Jose";
		cliente2.cfp = "987654321";

		ContaBancaria conta2 = new ContaBancaria();
		conta2.agencia = "666-2";
		conta2.numeroConta = 22258;
		conta2.saldo = 100.00;

		// **********EXECUÇÃO DO PROGRAMA************* \\
		
		
		// *******SAQUE DE DINHEIRO********************\\
		
		System.out.println("\nValor da conta antes do saque: R$" + conta1.saldo);
		conta1.sacar(50.00);
		
		System.out.println("Saldo após saque: R$" + conta1.saldo);

		//************DEPÓSITO*************************\\
		System.out.println("\nValor da conta antes do depósito: R$" + conta1.saldo);
		conta1.depositar(30);

		System.out.println("Saldo atual da conta: R$" + conta1.saldo);
		
		
		//**************TRANSFERENCIA******************\\
		
		conta1.transferir(conta2, 29);
		System.out.println("\nnSaldo atualizado conta 1: R$"+conta1.saldo);
		System.out.println("\nSaldo atualizado conta 2: R$"+conta2.saldo);


	}

}
