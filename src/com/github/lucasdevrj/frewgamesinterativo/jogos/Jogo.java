package com.github.lucasdevrj.frewgamesinterativo.jogos;

public abstract class Jogo {

	private String nome;
	private String dataLancamento;
	private String marca;
	private String genero;
	private float preco;
	
	public Jogo(String nome, String dataLancamento, String marca, String genero, float preco) {
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.marca = marca;
		this.genero = genero;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public float getPreco() {
		return preco;
	}
}
