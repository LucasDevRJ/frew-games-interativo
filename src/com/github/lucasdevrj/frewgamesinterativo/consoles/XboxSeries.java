package com.github.lucasdevrj.frewgamesinterativo.consoles;

import com.github.lucasdevrj.frewgamesinterativo.jogos.Jogo;
import com.github.lucasdevrj.frewgamesinterativo.jogos.JogoPlayStation;
import com.github.lucasdevrj.frewgamesinterativo.jogos.JogoXbox;
import com.github.lucasdevrj.frewgamesinterativo.loja.LojaVideoGame;

public class XboxSeries extends Xbox {

	public XboxSeries(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		super(codigo, nome, modelo, dataLancamento, marca, preco);
	}
	
	public static void exibeJogosXboxSeries() {
		System.out.println("\n----------|JOGOS DE XBOX SERIES|----------");
		System.out.println("Opção 1 - Metro Exodus.");
		System.out.println("Opção 2 - Elden Ring.");
		System.out.println("Opção 3 - Dying Light 2. Stay Human.");
		System.out.println("Opção 4 - Batman. Arkham Knight.");
		System.out.println("Opção 5 - Lego Star Wars: A Saga Skywalker Deluxe.");
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
					Jogo jogo = new JogoXbox(601, "Metro Exodus", "14/02/2019", "Tiro em primeira pessoa", "4A Games", 110.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXboxSeries();
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
					Jogo jogo = new JogoXbox(602, "Elden Ring", "25/02/2022", "RPG", "Bandai Namco", 180.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXboxSeries();
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
					Jogo jogo = new JogoXbox(603, "Dying Light 2. Stay Human", "14/02/2022","Terror", "Techland",  190.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXboxSeries();
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
					Jogo jogo = new JogoPlayStation(604, "Batman. Arkham Knight", "23/06/2015","Ação e Aventura", "WB Games Montréal", 190.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXboxSeries();
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
					Jogo jogo = new JogoPlayStation(505, "Lego Star Wars: A Saga Skywalker Deluxe", "18/04/2021","Mundo aberto", "WB Games Montréal", 200.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXboxSeries();
				}
				
			break;
		}
	}
}