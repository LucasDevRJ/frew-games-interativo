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
		System.out.println("Op��o 1 - Ratchet & Clank.");
		System.out.println("Op��o 2 - God of War Ragnar�k.");
		System.out.println("Op��o 3 - Demon's Souls.");
		System.out.println("Op��o 4 - Uncharted: Cole��o Legado Dos Ladr�es.");
		System.out.println("Op��o 5 - Horizon Forbidden West.");
		System.out.println("----------------------------------------------");

		System.out.print("Digite a op��o desejada: ");
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("\nDeseja adicionar o jogo no carrinho?");
			System.out.println("Op��o 1 - Sim.");
			System.out.println("Op��o 2 - Volta para o menu principal.");
			System.out.print("Digite sua op��o: ");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("\nJogo adicionado no carrinho!");
				Jogo jogo = new JogoPlayStation("Ratchet & Clank", "10/04/2016", "Plataforma", "Insomniac Games", 160.00f);
				LojaVideoGame.getJogos().add(jogo);
				LojaVideoGame.exibeMenu();

			} else if (opcao == 2) {
				LojaVideoGame.exibeMenu();

			} else {
				System.out.println("Op��o inv�lida!");
				PlayStation4.exibeJogosPlayStation4();
			}

			break;

		case 2:
			System.out.println("\nDeseja adicionar o jogo no carrinho?");
			System.out.println("Op��o 1 - Sim.");
			System.out.println("Op��o 2 - Volta para o menu principal.");
			System.out.print("Digite sua op��o: ");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("\nJogo adicionado no carrinho!");
				Jogo jogo = new JogoPlayStation("God of War Ragnar�k", "09/11/2022", "A��o e Aventura", " Santa Monica Studio", 190.00f);
				LojaVideoGame.getJogos().add(jogo);
				LojaVideoGame.exibeMenu();

			} else if (opcao == 2) {
				LojaVideoGame.exibeMenu();

			} else {
				System.out.println("Op��o inv�lida!");
				PlayStation4.exibeJogosPlayStation4();
			}

			break;

		case 3:

			System.out.println("\nDeseja adicionar o jogo no carrinho?");
			System.out.println("Op��o 1 - Sim.");
			System.out.println("Op��o 2 - Volta para o menu principal.");
			System.out.print("Digite sua op��o: ");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("\nJogo adicionado no carrinho!");
				Jogo jogo = new JogoPlayStation("Demon's Souls", "12/11/2020", "Aventura", "Bluepoint Games", 200.00f);
				LojaVideoGame.getJogos().add(jogo);
				LojaVideoGame.exibeMenu();

			} else if (opcao == 2) {
				LojaVideoGame.exibeMenu();

			} else {
				System.out.println("Op��o inv�lida!");
				PlayStation4.exibeJogosPlayStation4();
			}

			break;

		case 4:

			System.out.println("\nDeseja adicionar o jogo no carrinho?");
			System.out.println("Op��o 1 - Sim.");
			System.out.println("Op��o 2 - Volta para o menu principal.");
			System.out.print("Digite sua op��o: ");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("\nJogo adicionado no carrinho!");
				Jogo jogo = new JogoPlayStation("Uncharted: Cole��o Legado Dos Ladr�es", "28/01/2008", "Mundo Aberto", "Naughty Dogs", 190.00f);
				LojaVideoGame.getJogos().add(jogo);
				LojaVideoGame.exibeMenu();

			} else if (opcao == 2) {
				LojaVideoGame.exibeMenu();

			} else {
				System.out.println("Op��o inv�lida!");
				PlayStation4.exibeJogosPlayStation4();
			}

			break;

		case 5:

			System.out.println("\nDeseja adicionar o jogo no carrinho?");
			System.out.println("Op��o 1 - Sim.");
			System.out.println("Op��o 2 - Volta para o menu principal.");
			System.out.print("Digite sua op��o: ");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("\nJogo adicionado no carrinho!");
				Jogo jogo = new JogoPlayStation("Horizon Forbidden West", "18/02/2022", "A��o e Aventura", "Guerrilla Games", 170.00f);
				LojaVideoGame.getJogos().add(jogo);
				LojaVideoGame.exibeMenu();

			} else if (opcao == 2) {
				LojaVideoGame.exibeMenu();

			} else {
				System.out.println("Op��o inv�lida!");
				PlayStation4.exibeJogosPlayStation4();
			}

			break;

		default:
			System.out.println("Op��o inv�lida!");
			PlayStation4.exibeJogosPlayStation4();
			break;
		}
	}
}
