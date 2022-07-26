package com.github.lucasdevrj.frewgamesinterativo.consoles;

import com.github.lucasdevrj.frewgamesinterativo.jogos.Jogo;
import com.github.lucasdevrj.frewgamesinterativo.jogos.JogoPlayStation;
import com.github.lucasdevrj.frewgamesinterativo.loja.LojaVideoGame;

public class XboxOne extends Xbox {

	public XboxOne(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		super(codigo, nome, modelo, dataLancamento, marca, preco);
	}
	
	public static void exibeJogosXboxOne() {
		System.out.println("\n----------|JOGOS DE XBOX ONE|----------");
		System.out.println("Op��o 1 - Watch Dogs 2.");
		System.out.println("Op��o 2 - Far Cry 6.");
		System.out.println("Op��o 3 - Battlefield 2042.");
		System.out.println("Op��o 4 - Batman. Arkham Knight.");
		System.out.println("Op��o 5 - The Witcher 3.");
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
					Jogo jogo = new JogoPlayStation(306, "Silent Hill Hd Collection", "20/03/2012", "Terror", "KONAMI", 80.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosXbox360();
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
					Jogo jogo = new JogoPlayStation(307, "Deadpool", "25/06/2013","A��o e Aventura", "Activision", 70.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosXbox360();
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
					Jogo jogo = new JogoPlayStation(308, "Red Dead Redemption", "03/21/2010","Mundo Aberto", "Rockstar",  90.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosXbox360();
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
					Jogo jogo = new JogoPlayStation(309, "Jogo Batman - Arkham Origins", "25/10/2013","A��o e Aventura", " WB Games Montr�al", 80.00f);
					LojaVideoGame.getProdutos().add(jogo);
					LojaVideoGame.setPrecoTotal(LojaVideoGame.getPrecoTotal() + jogo.getPreco());
					LojaVideoGame.exibeMenu();
					
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosXbox360();
				}
				
			break;
	}
}
