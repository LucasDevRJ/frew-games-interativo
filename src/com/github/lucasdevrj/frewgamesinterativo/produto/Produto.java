package com.github.lucasdevrj.frewgamesinterativo.produto;

public abstract class Produto {
	
	private int codigo;
	private String nome;
	private String modelo;
	
	public Produto(int codigo, String nome, String modelo) {
		this.codigo = codigo;
		this.nome = nome;
		this.modelo = modelo;
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
}
