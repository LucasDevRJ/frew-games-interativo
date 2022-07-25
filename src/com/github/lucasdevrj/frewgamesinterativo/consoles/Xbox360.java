package com.github.lucasdevrj.frewgamesinterativo.consoles;

import com.github.lucasdevrj.frewgamesinterativo.jogos.Jogo;
import com.github.lucasdevrj.frewgamesinterativo.jogos.JogoPlayStation;
import com.github.lucasdevrj.frewgamesinterativo.loja.LojaVideoGame;

public class Xbox360 extends Xbox {

	public Xbox360(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		super(codigo, nome, modelo, dataLancamento, marca, preco);
	}
	
	public static void exibeJogosXbox360() {
		System.out.println("\n----------|JOGOS DE XBOX 360|----------");
		System.out.println("Opção 1 - Silent Hill Hd Collection.");
		System.out.println("Opção 2 - Deadpool.");
		System.out.println("Opção 3 - Red Dead Redemption.");
		System.out.println("Opção 4 - Jogo Batman - Arkham Origins.");
		System.out.println("Opção 5 - Assassin's Creed III.");
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
					Jogo jogo = new JogoPlayStation(306, "Silent Hill Hd Collection", "20/03/2012", "Terror", "KONAMI", 80.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXbox360();
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
					Jogo jogo = new JogoPlayStation(307, "Deadpool", "25/06/2013","Ação e Aventura", "Activision", 70.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXbox360();
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
					Jogo jogo = new JogoPlayStation(308, "Red Dead Redemption", "03/21/2010","Mundo Aberto", "Rockstar",  90.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXbox360();
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
					Jogo jogo = new JogoPlayStation(309, "Jogo Batman - Arkham Origins", "25/10/2013","Ação e Aventura", " WB Games Montréal", 80.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXbox360();
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
					Jogo jogo = new JogoPlayStation(310, "Assassin's Creed III", "30/10/2012","Mundo Aberto", "UBISOFT", 87.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Opção inválida!");
					exibeJogosXbox360();
				}
			
			break;
			
			default:
				System.out.println("Opção inválida!");
				exibeJogosXbox360();
			break;
		}
	}
}
