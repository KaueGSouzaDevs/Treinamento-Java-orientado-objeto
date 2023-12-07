package br.com.treinamento.polimorfismo.service;

import br.com.treinamento.polimorfismo.model.Designer;
import br.com.treinamento.polimorfismo.model.EditorVideo;
import br.com.treinamento.polimorfismo.model.Funcionario;
import br.com.treinamento.polimorfismo.model.Gerente;
import lombok.Getter;

public class ControleBonificacao {

	@Getter 
	private Double soma = 0.0;
	
	public void registra(Gerente gerente) {
		
		this.soma += gerente.getBonificacao();

		
		/*
		 					^
		this.soma = this.soma+gerente.getBonificacao();
		
							or
		Double boni = gerente.getBonificacao();
		this.soma = this.soma+boni;					
		*/
	}
	
	public void registra(Funcionario funcionario) {
		soma += funcionario.getBonificacao();
	}
	
	public void registra(Designer designer) {
		soma += designer.getBonificacao();
	}
	
	public void registra(EditorVideo editorVideo) {
		soma += editorVideo.getBonificacao();
	}
	
	
}
