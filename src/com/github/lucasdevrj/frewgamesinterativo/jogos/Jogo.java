package com.github.lucasdevrj.frewgamesinterativo.jogos;

import com.github.lucasdevrj.frewgamesinterativo.produto.Produto;

public abstract class Jogo extends Produto {
	
	private String genero;

	public Jogo(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		super(codigo, nome, modelo, dataLancamento, marca, preco);
	}
	
	public String getGenero() {
		return genero;
	}
}
