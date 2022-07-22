package com.github.lucasdevrj.frewgamesinterativo.consoles;

public abstract class Console {

	private String nome;
	private String processador;
	private String cor;
	private float preco;
	
	public String getNome() {
		return nome;
	}
	
	public String getProcessador() {
		return processador;
	}
	
	public String getCor() {
		return cor;
	}
	
	public float getPreco() {
		return preco;
	}
}
