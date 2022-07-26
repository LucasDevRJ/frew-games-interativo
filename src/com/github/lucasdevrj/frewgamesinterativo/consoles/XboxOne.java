package com.github.lucasdevrj.frewgamesinterativo.consoles;

import com.github.lucasdevrj.frewgamesinterativo.jogos.Jogo;
import com.github.lucasdevrj.frewgamesinterativo.jogos.JogoPlayStation;
import com.github.lucasdevrj.frewgamesinterativo.jogos.JogoXbox;
import com.github.lucasdevrj.frewgamesinterativo.loja.LojaVideoGame;

public class XboxOne extends Xbox {

	public XboxOne(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		super(codigo, nome, modelo, dataLancamento, marca, preco);
	}
	
	public static void exibeJogosXboxOne() {
		System.out.println("\n----------|JOGOS DE XBOX ONE|----------");
		System.out.println("Opção 1 - Watch Dogs 2.");
		System.out.println("Opção 2 - Far Cry 6.");
		System.out.println("Opção 3 - Battlefield 2042.");
		System.out.println("Opção 4 - Batman. Arkham Knight.");
		System.out.println("Opção 5 - The Witcher 3.");
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
					Jogo jogo = new JogoXbox(501, "Watch Dogs 2", "09/11/2016", "Mundo Aberto", "Ubisoft", 120.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXboxOne();
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
					Jogo jogo = new JogoXbox(502, "Far Cry 6", "06/08/2021", "Tiro em primeira pessoa", "Ubisoft", 120.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXboxOne();
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
					Jogo jogo = new JogoXbox(503, "Battlefield 2042", "12/03/2021","Tiro em primeira pessoa", "Electronic",  130.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXboxOne();
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
					Jogo jogo = new JogoPlayStation(504, "Batman. Arkham Knight", "23/06/2015","Ação e Aventura", "WB Games Montréal", 130.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXboxOne();
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
					Jogo jogo = new JogoPlayStation(505, "The Witcher 3", "18/03/2015","Mundo aberto", "WB Games Montréal", 140.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXboxOne();
				}
				
			break;
		}
	}
}
