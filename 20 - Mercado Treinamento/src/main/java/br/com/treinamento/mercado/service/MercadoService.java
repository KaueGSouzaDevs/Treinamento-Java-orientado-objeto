package br.com.treinamento.mercado.service;

import java.math.BigDecimal;

import br.com.treinamento.mercado.main.Principal;
import br.com.treinamento.mercado.model.Cliente;
import br.com.treinamento.mercado.model.Produtos;

public class MercadoService {

	/**
	 * Monta um menu com as funções implementadas no sistema.
	 */
	public static void montarMenu() {
		System.out.println("Sistema de vendas - Selecione uma opção:");
		System.out.println("1 - Cadastrar clientes.");
		System.out.println("2 - Listar clientes.");
		System.out.println("2 - Cadastrar produtos.");		
		System.out.println("5 - Sair.");
	}

	/**
	 * Método para o cadastro de novos clientes.
	 */
	public static void cadastroClientes() {
		System.out.println("Cadastro do cliente.");
		System.out.println("------------------------------------");

		System.out.print("Nome: ");
		String nome = Principal.scanner.nextLine();

		System.out.print("Email: ");
		String email = Principal.scanner.nextLine();

		Principal.clienteList.add(new Cliente(nome, email));
	}
	
	public static void cadastroProdutos() {
		System.out.println("Cadastro do cliente.");
		System.out.println("------------------------------------");
		
		System.out.print("Nome: ");
		String nome = Principal.scanner.nextLine();
		
		System.out.print("Preço: ");
		String precoString = Principal.scanner.nextLine();
		
		BigDecimal preco = new BigDecimal(precoString);
		
		Principal.produtoList.add(new Produtos(nome, preco));
	}

	/**
	 * Método para listar todos os clientes cadastrados.
	 */
	public static void listarClientes() {
		System.out.println("Listagem de Clientes");
		System.out.println("--------------------------------------");
		System.out.println("Nome \t\t Email");
		System.out.println("--------------------------------------");

		Principal.clienteList.forEach(c -> System.out.println(c.getNome() + "\t\t" + c.getEmail()));

		System.out.println("--------------------------------------");
	}

}
