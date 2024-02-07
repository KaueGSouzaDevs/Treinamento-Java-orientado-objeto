package br.com.treinamento.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.treinamento.jdbc.model.Produto;
import br.com.treinamento.jdbc.service.ProdutoService;
import br.com.treinamento.jdbc.service.SistemaService;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {

		ProdutoService produtoService = new ProdutoService();

		while (true) {

			SistemaService.montaMenu();
			System.out.print("\nInforme a opção: ");
			Integer opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1: {

				produtoService.cadastrarProduto();

				break;
			}
			case 2: {
				
				produtoService.listarProdutos();
				
				break;
			}
			case 3: {

				produtoService.visualizarProduto();
				
				break;
			}
			case 4: {

				produtoService.excluirProdutos();
								
				break;
			}
			case 5:{
				
				produtoService.atualizarProduto();
				
				break;
			}
			case 6:{
				System.out.println("Fechando sistema.");
				System.exit(0);
				break;
			}
			default:
				System.out.println("Opção inválida!");
			}

		}
	}
}