package com.github.lucasdevrj.frewgamesinterativo.consoles;

import com.github.lucasdevrj.frewgamesinterativo.produto.Produto;

public abstract class Console extends Produto {

	private String nome;
	private String processador;
	private int armazenamento;
	private String cor;
	private float preco;
	
	public Console(int codigo, String nome, String modelo) {
		super(codigo, nome, modelo);
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getProcessador() {
		return processador;
	}
	
	public int getArmazenamento() {
		return armazenamento;
	}
	
	public String getCor() {
		return cor;
	}
	
	public float getPreco() {
		return preco;
	}
}
