package com.github.lucasdevrj.frewgamesinterativo.consoles;

import com.github.lucasdevrj.frewgamesinterativo.jogos.Jogo;
import com.github.lucasdevrj.frewgamesinterativo.jogos.JogoPlayStation;
import com.github.lucasdevrj.frewgamesinterativo.loja.LojaVideoGame;

public class PlayStation5 extends PlayStation {

	public PlayStation5(int codigo, String nome, String modelo, float preco, String processador, int armazenamento) {
		super(codigo, nome, modelo, preco, processador, armazenamento);
	}

	public static void exibeJogosPlayStation5() {
		System.out.println("\n----------|JOGOS DE PLAYSTATION 5|----------");
		System.out.println("Opção 1 - Ratchet & Clank.");
		System.out.println("Opção 2 - God of War Ragnarök.");
		System.out.println("Opção 3 - Demon's Souls.");
		System.out.println("Opção 4 - Uncharted: Coleção Legado Dos Ladrões.");
		System.out.println("Opção 5 - Horizon Forbidden West.");
		System.out.println("----------------------------------------------");

		System.out.print("Digite a opção desejada: ");
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("\nDeseja adicionar o jogo no carrinho?");
			System.out.println("Opção 1 - Sim.");
			System.out.println("Opção 2 - Volta para o menu principal.");
			System.out.print("Digite sua opção: ");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("\nJogo adicionado no carrinho!");
				Jogo jogo = new JogoPlayStation("Ratchet & Clank", "10/04/2016", "Plataforma", "Insomniac Games", 160.00f);
				LojaVideoGame.getJogos().add(jogo);
				LojaVideoGame.exibeMenu();

			} else if (opcao == 2) {
				LojaVideoGame.exibeMenu();

			} else {
				System.out.println("Opção inválida!");
				PlayStation4.exibeJogosPlayStation4();
			}

			break;

		case 2:
			System.out.println("\nDeseja adicionar o jogo no carrinho?");
			System.out.println("Opção 1 - Sim.");
			System.out.println("Opção 2 - Volta para o menu principal.");
			System.out.print("Digite sua opção: ");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("\nJogo adicionado no carrinho!");
				Jogo jogo = new JogoPlayStation("God of War Ragnarök", "09/11/2022", "Ação e Aventura", " Santa Monica Studio", 190.00f);
				LojaVideoGame.getJogos().add(jogo);
				LojaVideoGame.exibeMenu();

			} else if (opcao == 2) {
				LojaVideoGame.exibeMenu();

			} else {
				System.out.println("Opção inválida!");
				PlayStation4.exibeJogosPlayStation4();
			}

			break;

		case 3:

			System.out.println("\nDeseja adicionar o jogo no carrinho?");
			System.out.println("Opção 1 - Sim.");
			System.out.println("Opção 2 - Volta para o menu principal.");
			System.out.print("Digite sua opção: ");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("\nJogo adicionado no carrinho!");
				Jogo jogo = new JogoPlayStation("Demon's Souls", "12/11/2020", "Aventura", "Bluepoint Games", 200.00f);
				LojaVideoGame.getJogos().add(jogo);
				LojaVideoGame.exibeMenu();

			} else if (opcao == 2) {
				LojaVideoGame.exibeMenu();

			} else {
				System.out.println("Opção inválida!");
				PlayStation4.exibeJogosPlayStation4();
			}

			break;

		case 4:

			System.out.println("\nDeseja adicionar o jogo no carrinho?");
			System.out.println("Opção 1 - Sim.");
			System.out.println("Opção 2 - Volta para o menu principal.");
			System.out.print("Digite sua opção: ");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("\nJogo adicionado no carrinho!");
				Jogo jogo = new JogoPlayStation("Uncharted: Coleção Legado Dos Ladrões", "28/01/2008", "Mundo Aberto", "Naughty Dogs", 190.00f);
				LojaVideoGame.getJogos().add(jogo);
				LojaVideoGame.exibeMenu();

			} else if (opcao == 2) {
				LojaVideoGame.exibeMenu();

			} else {
				System.out.println("Opção inválida!");
				PlayStation4.exibeJogosPlayStation4();
			}

			break;

		case 5:

			System.out.println("\nDeseja adicionar o jogo no carrinho?");
			System.out.println("Opção 1 - Sim.");
			System.out.println("Opção 2 - Volta para o menu principal.");
			System.out.print("Digite sua opção: ");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("\nJogo adicionado no carrinho!");
				Jogo jogo = new JogoPlayStation("Horizon Forbidden West", "18/02/2022", "Ação e Aventura", "Guerrilla Games", 170.00f);
				LojaVideoGame.getJogos().add(jogo);
				LojaVideoGame.exibeMenu();

			} else if (opcao == 2) {
				LojaVideoGame.exibeMenu();

			} else {
				System.out.println("Opção inválida!");
				PlayStation4.exibeJogosPlayStation4();
			}

			break;

		default:
			System.out.println("Opção inválida!");
			PlayStation4.exibeJogosPlayStation4();
			break;
		}
	}
}
