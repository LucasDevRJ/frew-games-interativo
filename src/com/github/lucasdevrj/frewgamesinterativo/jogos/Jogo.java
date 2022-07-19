package com.github.lucasdevrj.frewgamesinterativo.jogos;

public class Jogo {

	private String nome;
	private String dataLancamento;
	private String marca;
	private String plataforma;
	
	public Jogo(String nome, String dataLancamento, String marca, String plataforma) {
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.marca = marca;
		this.plataforma = plataforma;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getPlataforma() {
		return plataforma;
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
}
