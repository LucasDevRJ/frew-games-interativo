package com.github.lucasdevrj.frewgamesinterativo.consoles;

public abstract class Console {

	private String nome;
	private String processador;
	private int armazenamento;
	private String cor;
	private float preco;
	
	public Console(String nome, String processador, int armazenamento, String cor, float preco) {
		this.nome = nome;
		this.processador = processador;
		this.armazenamento = armazenamento;
		this.cor = cor;
		this.preco = preco;
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
