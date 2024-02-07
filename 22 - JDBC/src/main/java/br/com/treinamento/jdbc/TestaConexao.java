package br.com.treinamento.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.treinamento.jdbc.factory.ConnectionFactory;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		System.out.println("Conectanto com o banco");
		
		Connection connection = connectionFactory.abreConexao();
		System.out.println("Abriu conexao");
		
		System.out.println("\n");
		
		System.out.println("Fechando conexao.");
		connection.close();
		System.out.println("Conexão fechada");
	}	
	
}
