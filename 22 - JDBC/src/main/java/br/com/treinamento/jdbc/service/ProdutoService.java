package br.com.treinamento.jdbc.service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import br.com.treinamento.jdbc.Main;
import br.com.treinamento.jdbc.dao.ProdutoDao;
import br.com.treinamento.jdbc.model.Produto;

public class ProdutoService {
	
	/**
	 * Cadastrar produto no banco de dados na tabela (tb_produto).
	 */
		public void cadastrarProduto() {
		System.out.printf("\n&-15s\n","Cadastrar produto.");

		System.out.print("Informe nome do produto: ");
		String nome = Main.scanner.nextLine();

		System.out.print("-----------------------------\nInforme o preço: R$");
		String precoVar = Main.scanner.nextLine().replace(",", ".");
		BigDecimal preco = new BigDecimal(precoVar);

		Produto produto = new Produto(nome, preco);

		try {
			salvarProduto(produto);
			System.out.println(
					"-----------------------------\n\nProduto cadastrado com sucesso!\nPressione enter pra continuar.\n------------------------------");
			Main.scanner.nextLine();

		} catch (SQLException e) {
			System.out.println("Erro ao salvar produto: " + e.getMessage());
			System.out.println("\nPressione enter pra continuar.");
			System.out.println("\n------------------------------");
			Main.scanner.nextLine();

		}

	}

	/**
	 * Salvar um produto.
	 */
	public void salvarProduto(Produto produto) throws SQLException {
		ProdutoDao produtodao = new ProdutoDao();
		produtodao.salvarProduto(produto);

	}

	
	/*
	 * Listar produtos.
	 */
	public void listarProdutos() throws SQLException {

		ProdutoDao produtoDao = new ProdutoDao();
		List<Produto> produtos = produtoDao.listarProduto();
		
		System.out.printf("\n%-10s %-15s\n", " ","Listagem de produtos");
		System.out.printf("%-15s %-20s %-10s", "ID", "Nome", "Preço");
		
		for (Produto produto : produtos) {
			
			System.out.printf("\n%-15s %-20s %-10s", produto.getId() , produto.getNome() , produto.getPreco());
		}
		
		System.out.printf("\n%-15s %-15s", " ","Fim da Lista!\n\nPressione enter para voltar ao menu.");
		Main.scanner.nextLine();
	}

	
	/**
	 * Visualizar produto.
	 */
	public void visualizarProduto() throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();

		System.out.println("\n-------------------------------------------\n\tDetalhar produtos\n-------------------------------------------");

		System.out.print("Informe o ID do produto: ");
		Integer codigo = Main.scanner.nextInt();
		Main.scanner.nextLine();
		
		Optional<Produto> produtoOptional = produtoDao.buscarPorId(codigo);
		
		if (produtoOptional.isEmpty()) {
			System.out.println("\nProduto não encontrado.");
		}else {
			Produto produto = produtoOptional.get();
			System.out.println("\nNome do produto: "+ produto.getNome());
			System.out.println("Preço: "+ produto.getPreco());
		}
		System.out.println("\nPressione enter para continuar.");
		Main.scanner.nextLine();
	
	}

	
	/**
	 * Deleta o item do banco de dados.
	 */
	public void excluirProdutos() throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		
		System.out.println("\n-------------------------------------------");
		System.out.print("Informe o ID do produto que deseja excluir: ");
		Integer codigo = Main.scanner.nextInt();
		System.out.println("-------------------------------------------");
		Main.scanner.nextLine();
		
		Optional<Produto> produtoOptional = produtoDao.buscarPorId(codigo);

		
		if (produtoOptional.isEmpty()) {
			System.out.println("\nProduto não encontrado.");
		} else {
			Produto produto = produtoOptional.get();

			System.out.print("\nDeseja excluir o produto: " + produto.getNome() + "? (S/N).");
			System.out.print("\nConfirmação: ");
			String confirmacao = Main.scanner.nextLine();
			System.out.println("\n");
			
			if (confirmacao.equalsIgnoreCase("S")) {
				ProdutoDao.excluirProduto(codigo);
				System.out.println("\nProduto deletado do banco de dados.\n");

			} else {
				System.out.println("\nExclusão cancelada.");
				System.out.println("-------------------");
			}
			System.out.println("\nPressione enter para continuar.");
			Main.scanner.nextLine();

		}

	}

	
	
	
	/**
	 * Atualiza um determinado produto.
	 */
	public void atualizarProduto() throws SQLException {

		ProdutoDao produtoDao = new ProdutoDao();
		
		System.out.println("\n-------------------------------------------");
		System.out.print("Informe o ID do produto que deseja atualizar: ");
		Integer codigo = Main.scanner.nextInt();
		System.out.println("-------------------------------------------\n");
		Main.scanner.nextLine();
		
		Optional<Produto> produtoOptional = produtoDao.buscarPorId(codigo);

		
		if (produtoOptional.isEmpty()) {
			System.out.println("\nProduto não encontrado.");
		} else {
			Produto produto = produtoOptional.get();

			System.out.print("Informe nome do produto: ");
			String nome = Main.scanner.nextLine();
			produto.setNome(nome);

			System.out.print("-----------------------------\nInforme o preço: R$");
			String precoVar = Main.scanner.nextLine().replace(",", ".");
			BigDecimal preco = new BigDecimal(precoVar);
			produto.setPreco(preco);

			produtoDao.atualizarProduto(produto);
			System.out.println("\n-----------------------------\nProduto atualizado com sucesso.");
		}
			
			
			
			System.out.println("\nPressione enter para continuar.");
			Main.scanner.nextLine();

	}
		
	
	

	
}
