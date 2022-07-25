package com.github.lucasdevrj.frewgamesinterativo.consoles;

import java.util.Scanner;

import com.github.lucasdevrj.frewgamesinterativo.loja.LojaVideoGame;

public abstract class Xbox extends Console {

	public Xbox(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		super(codigo, nome, modelo, dataLancamento, marca, preco);
	}
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void exibeConsolesPlayStation() {
		System.out.println("\n----------|MODELOS DE XBOX|----------");
		System.out.println("Op��o 1 - Xbox 360.");
		System.out.println("Op��o 2 - Xbox One.");
		System.out.println("Op��o 3 - Xbox Series.");
		System.out.println("Op��o 4 - Voltar.");
		System.out.println("--------------------------------------------");
		
		System.out.print("Digite a op��o desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				Xbox xbox360 = new Xbox360(2001, "Xbox 360", "Xbox 360 E", "11/02/2013", "Microsoft", 1000.00f);
				System.out.println(xbox360.toString());
				
				System.out.println("\nDeseja adicionar este console no carrinho?");
				System.out.println("Op��o 1 - Sim.");
				System.out.println("Op��o 2 - N�o.");
				System.out.print("Digite sua op��o: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					LojaVideoGame.getProdutos().add(xbox360);
					System.out.println("Console adicionado no carrinho!");
					LojaVideoGame.exibeMenu();
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenuConsoles();
				} else {
					System.out.println("Op��o inv�lida!");
					LojaVideoGame.exibeMenu();
				}
			break;
			
			case 2:
				Xbox xboxOne = new XboxOne(2002, "Xbox One", "Xbox One S", "15/11/2016", "Microsoft", 1600.00f);
				System.out.println(ps4.toString());
				
				System.out.println("\nDeseja adicionar este console no carrinho?");
				System.out.println("Op��o 1 - Sim.");
				System.out.println("Op��o 2 - N�o.");
				System.out.print("Digite sua op��o: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					LojaVideoGame.getProdutos().add(ps4);
					System.out.println("Console adicionado no carrinho!");
					LojaVideoGame.exibeMenu();
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenuConsoles();
				} else {
					System.out.println("Op��o inv�lida!");
					LojaVideoGame.exibeMenu();
				}
			break;
			
			case 3:
				PlayStation5 ps5 = new PlayStation5(1003, "PlayStation 5", "PlayStation 5", "19/11/2020", "Sony", 2500.00f);
				System.out.println(ps5.toString());
				
				System.out.println("\nDeseja adicionar este console no carrinho?");
				System.out.println("Op��o 1 - Sim.");
				System.out.println("Op��o 2 - N�o.");
				System.out.print("Digite sua op��o: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					LojaVideoGame.getProdutos().add(ps5);
					System.out.println("Console adicionado no carrinho!");
					LojaVideoGame.exibeMenu();
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenuConsoles();
				} else {
					System.out.println("Op��o inv�lida!");
					LojaVideoGame.exibeMenu();
				}
			break;
			
			case 4:
				LojaVideoGame.exibeMenu();
			break;
			
			default:
				System.out.println("Op��o inv�lida!");
				exibeConsolesPlayStation();
			break;
		}
	}
	
	public static void exibeJogosXbox() {
		System.out.println("\n----------|JOGOS DE XBOX|----------");
		System.out.println("Op��o 1 - Jogos de Xbox 360.");
		System.out.println("Op��o 2 - Jogos de Xbox One.");
		System.out.println("Op��o 3 - Jogos de Xbox Series X.");
		System.out.println("--------------------------------------------");
		
		System.out.print("Digite a op��o desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				PlayStation3.exibeJogosPlayStation3();
			break;
			
			case 2:
				PlayStation4.exibeJogosPlayStation4();
			break;
			
			case 3:
				PlayStation5.exibeJogosPlayStation5();
			break;
		}
	}

}
