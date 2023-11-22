package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Kauê Gallego");
		cliente1.setCpf("123456789");

		ContaBancaria conta1 = new ContaBancaria();
		conta1.setAgencia("777-9");
		conta1.setNumeroConta(456987);
		conta1.setSaldo(100.00);
		conta1.setTitular(cliente1);

		// ********************************************\\

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Givaldo Fernandes");
		cliente2.setCpf("987654321");

		ContaBancaria conta2 = new ContaBancaria();
		conta2.setAgencia("666-2");
		conta2.setNumeroConta(22258);
		conta2.setSaldo(100.00);
		conta2.setTitular(cliente2);

		// **********EXECUÇÃO DO PROGRAMA************* \\
		
		
		// *******SAQUE DE DINHEIRO********************\\
		
		System.out.println("\nValor da conta antes do saque: R$" + conta1.getSaldo());
		conta1.sacar(50.00);
		
		System.out.println("Saldo após saque: R$" + conta1.getSaldo());
		

		//************DEPÓSITO*************************\\
		System.out.println("\nValor da conta antes do depósito: R$" + conta1.getSaldo());
		conta1.depositar(30);

		System.out.println("Saldo atual da conta: R$" + conta1.getSaldo());
		
		
		//**************TRANSFERENCIA******************\\
		
		conta1.transferir(conta2, 10000);
		System.out.println("\n\nConta: "+conta1.getNumeroConta()+"\nTitular: "+conta1.getTitular().getNome()+"\nSaldo: R$"+conta1.getSaldo());
		System.out.println("\n\nConta: "+conta2.getNumeroConta()+"\nTitular: "+conta2.getTitular().getNome()+"\nSaldo: R$"+conta2.getSaldo());


	}

}
