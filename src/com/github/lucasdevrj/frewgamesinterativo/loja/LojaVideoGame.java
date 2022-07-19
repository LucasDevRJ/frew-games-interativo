package com.github.lucasdevrj.frewgamesinterativo.loja;

import java.util.Scanner;

public class LojaVideoGame {

	private String nome;
	private String endereco;
	
	Scanner entrada = new Scanner(System.in);
	
	public void exibeMensagemBoasVindas() {
		System.out.println("Olá, seja bem-vindo a loja " + getNome() + "!");
		System.out.println("Estamos localizados na " + getEndereco() + ".");
		exibeMenu();
	}
	
	public void exibeMenu() {
		System.out.println("----------|MENU PRINCIPAL|----------");
		System.out.println("Opção 1 - Jogos.");
		System.out.println("Opção 2 - Consoles.");
		System.out.println("Opção 3 - Acessórios.");
		System.out.println("Opção 4 - Comprar.");
		System.out.println("Opção 5 - Sair.");
		
		System.out.print("Digite a sua opção: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				exibeMenuJogos();
			break;
		}
	}
	
	public void exibeMenuJogos() {
		System.out.println("----------|MENU DE JOGOS|----------");
		System.out.println("Opção 1 - Jogos de PlayStation.");
		System.out.println("Opção 2 - Jogos de Xbox.");
		System.out.println("Opção 3 - Jogos de Nintendo.");
		
		System.out.print("Digite a sua opção: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				exibeJogosPlayStation();
			break;
		}
	}
	
	public void exibeJogosPlayStation() {
		System.out.println("----------|JOGOS DE PLAYSTATION|----------");
		System.out.println("Opção 1 - Jogos de PlayStation 3.");
		System.out.println("Opção 2 - Jogos de PlayStation 4.");
		System.out.println("Opção 3 - Jogos de PlayStation 5.");
		
		System.out.print("Digite a opção desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
			exibeJogosPlayStation3();
			break;
		}
	}
	
	public void exibeJogosPlayStation3() {
		System.out.println("----------|JOGOS DE PLAYSTATION 3|----------");
		System.out.println("Opção 1 - Grand Theft Auto V.");
		System.out.println("Opção 2 - Mortal Kombat Komplete Edition.");
		System.out.println("Opção 3 - God of War Collection.");
		System.out.println("Opção 4 - Jogo Metal Gear Solid 4: Guns of the Patriots.");
		System.out.println("Opção 5 - Call of Duty: Black Ops.");
		
		System.out.print("Digite a opção desejada: ");
		int opcao = entrada.nextInt();
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
