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
		System.out.println("Opção 1 - Xbox 360.");
		System.out.println("Opção 2 - Xbox One.");
		System.out.println("Opção 3 - Xbox Series.");
		System.out.println("Opção 4 - Voltar.");
		System.out.println("--------------------------------------------");
		
		System.out.print("Digite a opção desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				PlayStation3 ps3 = new PlayStation3(1001, "PlayStation 3", "Slim", "11/08/2010", "Sony", 1200.00f);
				System.out.println(ps3.toString());
				
				System.out.println("\nDeseja adicionar este console no carrinho?");
				System.out.println("Opção 1 - Sim.");
				System.out.println("Opção 2 - Não.");
				System.out.print("Digite sua opção: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					LojaVideoGame.getProdutos().add(ps3);
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
				PlayStation4 ps4 = new PlayStation4(1002, "PlayStation 4", "Pro", "15/11/2013", "Sony", 1800.00f);
				System.out.println(ps4.toString());
				
				System.out.println("\nDeseja adicionar este console no carrinho?");
				System.out.println("Opção 1 - Sim.");
				System.out.println("Opção 2 - Não.");
				System.out.print("Digite sua opção: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					LojaVideoGame.getProdutos().add(ps4);
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
				PlayStation5 ps5 = new PlayStation5(1003, "PlayStation 5", "PlayStation 5", "19/11/2020", "Sony", 2500.00f);
				System.out.println(ps5.toString());
				
				System.out.println("\nDeseja adicionar este console no carrinho?");
				System.out.println("Opção 1 - Sim.");
				System.out.println("Opção 2 - Não.");
				System.out.print("Digite sua opção: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					LojaVideoGame.getProdutos().add(ps5);
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
				exibeConsolesPlayStation();
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
