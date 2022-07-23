package com.github.lucasdevrj.frewgamesinterativo.produto;

public abstract class Produto {
	
	private int codigo;
	private String nome;
	private String modelo;
	private float preco;
	
	public Produto(int codigo, String nome, String modelo, float preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public float getPreco() {
		return preco;
	}
}
