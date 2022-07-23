package com.github.lucasdevrj.frewgamesinterativo.consoles;

import com.github.lucasdevrj.frewgamesinterativo.produto.Produto;

public abstract class Console extends Produto {

	private String processador;
	private int armazenamento;
	
	public Console(int codigo, String nome, String modelo, float preco, String processador, int armazenamento) {
		super(codigo, nome, modelo, preco);
		this.processador = processador;
		this.armazenamento = armazenamento;
	}
	
	public String getProcessador() {
		return processador;
	}
	
	public int getArmazenamento() {
		return armazenamento;
	}
}
