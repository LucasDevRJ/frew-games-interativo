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
		System.out.println("Op��o 1 - Silent Hill Hd Collection.");
		System.out.println("Op��o 2 - Deadpool.");
		System.out.println("Op��o 3 - Red Dead Redemption.");
		System.out.println("Op��o 4 - Jogo Batman - Arkham Origins.");
		System.out.println("Op��o 5 - Assassin's Creed Iii.");
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
					Jogo jogo = new JogoPlayStation(301, "Grand Theft Auto V", "10/05/2015", "A��o e Aventura", "TAKE-TWO", 90.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosPlayStation3();
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
					Jogo jogo = new JogoPlayStation(302, "Mortal Kombat Komplete Edition", "13/02/2011","Luta", " NetherRealm Studios", 120.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosPlayStation3();
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
					Jogo jogo = new JogoPlayStation(303, "God of War Collection", "13/11/2009","A��o e Aventura", "Sony",  100.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosPlayStation3();
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
					Jogo jogo = new JogoPlayStation(304, "Jogo Metal Gear Solid 4: Guns of the Patriots", "05/07/2008","A��o e Aventura", "KONAMI", 110.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosPlayStation3();
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
					Jogo jogo = new JogoPlayStation(305, "Call of Duty: Black Ops", "05/07/2010","A��o e Aventura", "Activision", 82.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosPlayStation3();
				}
			
			break;
			
			default:
				System.out.println("Op��o inv�lida!");
				exibeJogosPlayStation3();
			break;
		}
	}
}
