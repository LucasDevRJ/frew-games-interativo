package com.github.lucasdevrj.frewgamesinterativo.consoles;

import com.github.lucasdevrj.frewgamesinterativo.jogos.Jogo;
import com.github.lucasdevrj.frewgamesinterativo.jogos.JogoPlayStation;
import com.github.lucasdevrj.frewgamesinterativo.loja.LojaVideoGame;

public class PlayStation5 extends PlayStation {

	public PlayStation5(String nome, String processador, int armazenamento, String cor, float preco) {
		super(nome, processador, armazenamento, cor, preco);
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
				Jogo jogo = new JogoPlayStation("Marvel's Spider-Man: Miles Morales", "12/11/2020", "A��o e Aventura",
						"Insomniac Games", 120.00f);
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
				Jogo jogo = new JogoPlayStation("The Last of Us Part II", "19/06/2020", "A��o e Aventura",
						"NetherRealm Studios", 120.00f);
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
				Jogo jogo = new JogoPlayStation("Horizon Zero Dawn Complete Edition Hits", "28/02/2017", "Mundo Aberto",
						"Guerrilla Games", 110.00f);
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
				Jogo jogo = new JogoPlayStation("JRed Dead Redemption 2", "05/07/2008", "Mundo Aberto",
						"Rockstar Games", 130.00f);
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
				Jogo jogo = new JogoPlayStation("Days Gone", "26/04/2019", "Mundo Aberto", "Bend Studio", 95.00f);
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
