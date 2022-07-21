package com.github.lucasdevrj.frewgamesinterativo.jogos;

public class Jogo {

	private String nome;
	private String dataLancamento;
	private String marca;
	private String genero;
	private String plataforma;
	private float preco;
	
	public Jogo(String nome, String dataLancamento, String marca, String genero, String plataforma, float preco) {
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.marca = marca;
		this.genero = genero;
		this.plataforma = plataforma;
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
	
	public String getPlataforma() {
		return plataforma;
	}
	
	public float getPreco() {
		return preco;
	}
}
