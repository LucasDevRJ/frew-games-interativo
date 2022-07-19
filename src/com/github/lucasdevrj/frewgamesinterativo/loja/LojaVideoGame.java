package com.github.lucasdevrj.frewgamesinterativo.loja;

import java.util.Scanner;

public class LojaVideoGame {

	private String nome;
	private String endereco;
	
	Scanner entrada = new Scanner(System.in);
	
	public void exibeMensagemBoasVindas() {
		System.out.println("Olá, seja bem-vindo a loja ");
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
