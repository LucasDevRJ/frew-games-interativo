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
		System.out.println("Op��o 1 - Metro Exodus.");
		System.out.println("Op��o 2 - Elden Ring.");
		System.out.println("Op��o 3 - Dying Light 2. Stay Human.");
		System.out.println("Op��o 4 - Batman. Arkham Knight.");
		System.out.println("Op��o 5 - Lego Star Wars: A Saga Skywalker Deluxe.");
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
					Jogo jogo = new JogoXbox(601, "Metro Exodus", "14/02/2019", "Tiro em primeira pessoa", "4A Games", 110.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosXboxSeries();
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
					Jogo jogo = new JogoXbox(502, "Far Cry 6", "06/08/2021", "Tiro em primeira pessoa", "Ubisoft", 120.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosXboxSeries();
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
					Jogo jogo = new JogoXbox(503, "Battlefield 2042", "12/03/2021","Tiro em primeira pessoa", "Electronic",  130.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosXboxSeries();
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
					Jogo jogo = new JogoPlayStation(504, "Batman. Arkham Knight", "23/06/2015","A��o e Aventura", "WB Games Montr�al", 130.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosXboxSeries();
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
					Jogo jogo = new JogoPlayStation(505, "The Witcher 3", "18/03/2015","Mundo aberto", "WB Games Montr�al", 140.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosXboxSeries();
				}
				
			break;
		}
	}
}