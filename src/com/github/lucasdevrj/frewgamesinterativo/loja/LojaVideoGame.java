package com.github.lucasdevrj.frewgamesinterativo.loja;

import java.util.ArrayList;
import java.util.Scanner;

import com.github.lucasdevrj.frewgamesinterativo.consoles.PlayStation;
import com.github.lucasdevrj.frewgamesinterativo.jogos.Jogo;

public class LojaVideoGame {

	private String nome;
	private String endereco;
	ArrayList<Jogo> jogos = new ArrayList<Jogo>();
	
	static Scanner entrada = new Scanner(System.in);
	
	public void exibeMensagemBoasVindas() {
		System.out.println("Ol�, seja bem-vindo a loja " + getNome() + "!");
		System.out.println("Estamos localizados na " + getEndereco() + ".");
		exibeMenu();
	}
	
	public static void exibeMenu() {
		System.out.println("\n----------|MENU PRINCIPAL|----------");
		System.out.println("Op��o 1 - Jogos.");
		System.out.println("Op��o 2 - Consoles.");
		System.out.println("Op��o 3 - Acess�rios.");
		System.out.println("Op��o 4 - Comprar.");
		System.out.println("Op��o 5 - Ver carrinho.");
		System.out.println("Op��o 6 - Sair.");
		
		System.out.println("-------------------------------------");
		
		System.out.print("Digite a sua op��o: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				exibeMenuJogos();
			break;
		}
	}
	
	public static void exibeMenuJogos() {
		System.out.println("\n----------|MENU DE JOGOS|----------");
		System.out.println("Op��o 1 - Jogos de PlayStation.");
		System.out.println("Op��o 2 - Jogos de Xbox.");
		System.out.println("Op��o 3 - Jogos de Nintendo.");
		System.out.println("-------------------------------------");
		
		System.out.print("Digite a sua op��o: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				PlayStation ps = new PlayStation();
				ps.exibeJogosPlayStation();
			break;
		}
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
	
	public ArrayList<Jogo> getJogos() {
		return jogos;
	}
}
