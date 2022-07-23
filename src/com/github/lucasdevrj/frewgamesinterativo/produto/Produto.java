package com.github.lucasdevrj.frewgamesinterativo.produto;

public abstract class Produto {
	
	private int codigo;
	private String nome;
	private String modelo;
	private String dataLancamento;
	private String marca;
	private float preco;
	
	public Produto(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.modelo = modelo;
		this.dataLancamento = dataLancamento;
		this.marca = marca;
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
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public float getPreco() {
		return preco;
	}
}
