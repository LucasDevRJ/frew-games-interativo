package com.github.lucasdevrj.frewgamesinterativo.loja;

import java.util.ArrayList;
import java.util.Scanner;

import com.github.lucasdevrj.frewgamesinterativo.consoles.PlayStation;
import com.github.lucasdevrj.frewgamesinterativo.jogos.Jogo;

public class LojaVideoGame {

	private String nome;
	private String endereco;
	static ArrayList<Jogo> jogos = new ArrayList<Jogo>();
	private static float precoTotal;
	
	static Scanner entrada = new Scanner(System.in);
	
	public void exibeMensagemBoasVindas() {
		System.out.println("Olá, seja bem-vindo a loja " + getNome() + "!");
		System.out.println("Estamos localizados na " + getEndereco() + ".");
		exibeMenu();
	}
	
	public static void exibeMenu() {
		System.out.println("\n----------|MENU PRINCIPAL|----------");
		System.out.println("Opção 1 - Jogos.");
		System.out.println("Opção 2 - Consoles.");
		System.out.println("Opção 3 - Acessórios.");
		System.out.println("Opção 4 - Comprar.");
		System.out.println("Opção 5 - Ver carrinho.");
		System.out.println("Opção 6 - Sair.");
		
		System.out.println("-------------------------------------");
		
		System.out.print("Digite a sua opção: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				exibeMenuJogos();
			break;
			
			case 4:
				comprar();
			break;
		}
	}
	
	public static void exibeMenuJogos() {
		System.out.println("\n----------|MENU DE JOGOS|----------");
		System.out.println("Opção 1 - Jogos de PlayStation.");
		System.out.println("Opção 2 - Jogos de Xbox.");
		System.out.println("Opção 3 - Jogos de Nintendo.");
		System.out.println("-------------------------------------");
		
		System.out.print("Digite a sua opção: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				PlayStation.exibeJogosPlayStation();
			break;
		}
	}
	
	public static void comprar() {
		System.out.println("\n----------|COMPRAS|----------");
		if (!getJogos().isEmpty()) {
			System.out.println("Nota Fiscal");
			for (int i = 0; i < getJogos().size(); i++) {
				precoTotal += getJogos().get(i).getPreco();
				System.out.println("Jogo: " + jogos.get(i).getNome());
				System.out.println("Preço: " + jogos.get(i).getPreco());
				System.out.println();
			} 
			System.out.println("Valor total: R$ " + precoTotal);
		} else {
			System.out.println("\nNão tem nada no carrinho!");
			exibeMenu();
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
	
	public static ArrayList<Jogo> getJogos() {
		return jogos;
	}
}
