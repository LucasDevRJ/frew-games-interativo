package com.github.lucasdevrj.frewgamesinterativo.consoles;

import java.util.Scanner;

import com.github.lucasdevrj.frewgamesinterativo.loja.LojaVideoGame;

public abstract class Xbox extends Console {

	public Xbox(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		super(codigo, nome, modelo, dataLancamento, marca, preco);
	}
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void exibeConsolesXbox() {
		System.out.println("\n----------|MODELOS DE XBOX|----------");
		System.out.println("Opção 1 - Xbox 360.");
		System.out.println("Opção 2 - Xbox One.");
		System.out.println("Opção 3 - Xbox Series.");
		System.out.println("Opção 4 - Voltar.");
		System.out.println("--------------------------------------------");
		
		System.out.print("Digite a opção desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				Xbox xbox360 = new Xbox360(2001, "Xbox 360", "Xbox 360 E", "11/02/2013", "Microsoft", 1000.00f);
				System.out.println(xbox360.toString());
				
				System.out.println("\nDeseja adicionar este console no carrinho?");
				System.out.println("Opção 1 - Sim.");
				System.out.println("Opção 2 - Não.");
				System.out.print("Digite sua opção: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					LojaVideoGame.getProdutos().add(xbox360);
					System.out.println("Console adicionado no carrinho!");
					LojaVideoGame.exibeMenu();
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenuConsoles();
				} else {
					System.out.println("Opção inválida!");
					LojaVideoGame.exibeMenu();
				}
			break;
			
			case 2:
				Xbox xboxOne = new XboxOne(2002, "Xbox One", "Xbox One S", "15/11/2016", "Microsoft", 1600.00f);
				System.out.println(xboxOne.toString());
				
				System.out.println("\nDeseja adicionar este console no carrinho?");
				System.out.println("Opção 1 - Sim.");
				System.out.println("Opção 2 - Não.");
				System.out.print("Digite sua opção: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					LojaVideoGame.getProdutos().add(xboxOne);
					System.out.println("Console adicionado no carrinho!");
					LojaVideoGame.exibeMenu();
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenuConsoles();
				} else {
					System.out.println("Opção inválida!");
					LojaVideoGame.exibeMenu();
				}
			break;
			
			case 3:
				Xbox xboxSeries = new XboxOne(2002, "Xbox Series", "Xbox Series S", "10/11/2020", "Microsoft", 1900.00f);
				System.out.println(xboxSeries.toString());
				
				System.out.println("\nDeseja adicionar este console no carrinho?");
				System.out.println("Opção 1 - Sim.");
				System.out.println("Opção 2 - Não.");
				System.out.print("Digite sua opção: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					LojaVideoGame.getProdutos().add(xboxSeries);
					System.out.println("Console adicionado no carrinho!");
					LojaVideoGame.exibeMenu();
				} else if (opcao == 2) {
					LojaVideoGame.exibeMenuConsoles();
				} else {
					System.out.println("Opção inválida!");
					LojaVideoGame.exibeMenu();
				}
			break;
			
			case 4:
				LojaVideoGame.exibeMenu();
			break;
			
			default:
				System.out.println("Opção inválida!");
				exibeConsolesXbox();
			break;
		}
	}
	
	public static void exibeJogosXbox() {
		System.out.println("\n----------|JOGOS DE XBOX|----------");
		System.out.println("Opção 1 - Jogos de Xbox 360.");
		System.out.println("Opção 2 - Jogos de Xbox One.");
		System.out.println("Opção 3 - Jogos de Xbox Series X.");
		System.out.println("--------------------------------------------");
		
		System.out.print("Digite a opção desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				Xbox360.exibeJogosXbox360();
			break;
			
			case 2:
				Xbox360.exibeJogosXbox360();
			break;
			
			case 3:
				Xbox360.exibeJogosXbox360();
			break;
		}
	}

}
