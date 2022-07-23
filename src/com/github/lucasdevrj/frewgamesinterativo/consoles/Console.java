package com.github.lucasdevrj.frewgamesinterativo.consoles;

import com.github.lucasdevrj.frewgamesinterativo.produto.Produto;

public abstract class Console extends Produto {

	private String processador;
	private int armazenamento;
	
	public Console(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		super(codigo, nome, modelo, dataLancamento, marca, preco);
	}
	
	public String getProcessador() {
		return processador;
	}
	
	public int getArmazenamento() {
		return armazenamento;
	}
}
