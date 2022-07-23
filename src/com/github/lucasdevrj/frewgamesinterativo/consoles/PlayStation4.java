package com.github.lucasdevrj.frewgamesinterativo.consoles;

import java.util.Scanner;

import com.github.lucasdevrj.frewgamesinterativo.jogos.Jogo;
import com.github.lucasdevrj.frewgamesinterativo.jogos.JogoPlayStation;
import com.github.lucasdevrj.frewgamesinterativo.loja.LojaVideoGame;

public class PlayStation4 extends PlayStation {

	static Scanner entrada = new Scanner(System.in);

	public PlayStation4(String nome, String processador, int armazenamento, String cor, float preco) {
		super(nome, processador, armazenamento, cor, preco);
	}

	public static void exibeJogosPlayStation4() {
		System.out.println("\n----------|JOGOS DE PLAYSTATION 4|----------");
		System.out.println("Opção 1 - Marvel's Spider-Man: Miles Morales.");
		System.out.println("Opção 2 - The Last of Us Part II.");
		System.out.println("Opção 3 - Horizon Zero Dawn Complete Edition Hits.");
		System.out.println("Opção 4 - Red Dead Redemption 2.");
		System.out.println("Opção 5 - Days Gone.");
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
				Jogo jogo = new JogoPlayStation("Marvel's Spider-Man: Miles Morales", "12/11/2020", "Ação e Aventura", "Insomniac Games", 120.00f);
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
				Jogo jogo = new JogoPlayStation("The Last of Us Part II", "19/06/2020", "Ação e Aventura", "NetherRealm Studios", 120.00f);
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
				Jogo jogo = new JogoPlayStation("Horizon Zero Dawn Complete Edition Hits", "28/02/2017", "Mundo Aberto", "Guerrilla Games", 110.00f);
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
				Jogo jogo = new JogoPlayStation("JRed Dead Redemption 2", "05/07/2008", "Mundo Aberto", "Rockstar Games", 130.00f);
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
				Jogo jogo = new JogoPlayStation("Days Gone", "26/04/2019", "Mundo Aberto", "Bend Studio", 95.00f);
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
