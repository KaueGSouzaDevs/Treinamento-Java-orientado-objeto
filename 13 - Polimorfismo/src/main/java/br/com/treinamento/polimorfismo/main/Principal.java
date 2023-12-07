package br.com.treinamento.polimorfismo.main;

import br.com.treinamento.polimorfismo.model.Designer;
import br.com.treinamento.polimorfismo.model.EditorVideo;
import br.com.treinamento.polimorfismo.model.Funcionario;
import br.com.treinamento.polimorfismo.model.Gerente;
import br.com.treinamento.polimorfismo.service.ControleBonificacao;

public class Principal {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Kaue");
		gerente.setSalario(17000.00);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Pedro");
		funcionario.setSalario(500.00);
		
		Designer designer = new Designer();
		designer.setNome("Rodolfo");
		designer.setSalario(7000.00);
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setNome("Lucas");
		editorVideo.setSalario(6000.00);
		

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(funcionario);
		controle.registra(designer);
		controle.registra(editorVideo);
		
		System.out.println("Valor total da folha: "+controle.getSoma());
		
		
	}

}
