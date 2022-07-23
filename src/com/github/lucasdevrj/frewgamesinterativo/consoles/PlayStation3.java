package com.github.lucasdevrj.frewgamesinterativo.consoles;

import java.util.Scanner;

import com.github.lucasdevrj.frewgamesinterativo.jogos.Jogo;
import com.github.lucasdevrj.frewgamesinterativo.jogos.JogoPlayStation;
import com.github.lucasdevrj.frewgamesinterativo.loja.LojaVideoGame;

public class PlayStation3 extends PlayStation {
	
	public PlayStation3(int codigo, String nome, String modelo, float preco, String processador, int armazenamento) {
		super(codigo, nome, modelo, preco, processador, armazenamento);
	}

	static Scanner entrada = new Scanner(System.in);
	LojaVideoGame loja = new LojaVideoGame();
	
	public static void exibeJogosPlayStation3() {
		System.out.println("\n----------|JOGOS DE PLAYSTATION 3|----------");
		System.out.println("Opção 1 - Grand Theft Auto V.");
		System.out.println("Opção 2 - Mortal Kombat Komplete Edition.");
		System.out.println("Opção 3 - God of War Collection.");
		System.out.println("Opção 4 - Jogo Metal Gear Solid 4: Guns of the Patriots.");
		System.out.println("Opção 5 - Call of Duty: Black Ops.");
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
					Jogo jogo = new JogoPlayStation("Grand Theft Auto V", "10/05/2015", "Ação e Aventura", "TAKE-TWO", 90.00f);
					LojaVideoGame.getJogos().add(jogo);
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosPlayStation3();
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
					Jogo jogo = new JogoPlayStation("Mortal Kombat Komplete Edition", "13/02/2011","Luta", " NetherRealm Studios", 120.00f);
					LojaVideoGame.getJogos().add(jogo);
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosPlayStation3();
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
					Jogo jogo = new JogoPlayStation("God of War Collection", "13/11/2009","Ação e Aventura", "Sony",  100.00f);
					LojaVideoGame.getJogos().add(jogo);
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosPlayStation3();
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
					Jogo jogo = new JogoPlayStation("Jogo Metal Gear Solid 4: Guns of the Patriots", "05/07/2008","Ação e Aventura", "KONAMI", 110.00f);
					LojaVideoGame.getJogos().add(jogo);
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosPlayStation3();
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
					Jogo jogo = new JogoPlayStation("Call of Duty: Black Ops", "05/07/2010","Ação e Aventura", "Activision", 82.00f);
					LojaVideoGame.getJogos().add(jogo);
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosPlayStation3();
				}
			
			break;
			
			default:
				System.out.println("Opção inválida!");
				exibeJogosPlayStation3();
			break;
		}
	}
}
