package com.github.lucasdevrj.frewgamesinterativo.consoles;

import java.util.Scanner;

public abstract class PlayStation extends Console {

	public PlayStation(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		super(codigo, nome, modelo, dataLancamento, marca, preco);
	}

	static Scanner entrada = new Scanner(System.in);
	
	public static void exibeJogosPlayStation() {
		System.out.println("\n----------|JOGOS DE PLAYSTATION|----------");
		System.out.println("Opção 1 - Jogos de PlayStation 3.");
		System.out.println("Opção 2 - Jogos de PlayStation 4.");
		System.out.println("Opção 3 - Jogos de PlayStation 5.");
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
	
	public static void exibeConsolesPlayStation() {
		System.out.println("\n----------|MODELOS DE PLAYSTATION|----------");
		System.out.println("Opção 1 - PlayStation 3.");
		System.out.println("Opção 2 - PlayStation 4.");
		System.out.println("Opção 3 - PlayStation 5.");
		System.out.println("--------------------------------------------");
		
		System.out.print("Digite a opção desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				PlayStation3 ps3 = new PlayStation3(1001, "PlayStation 3", "Slim", "11/08/2010", "Sony", 1500.00f);
				System.out.println();
			break;
			
			case 2:
				
			break;
			
			case 3:
				
			break;
		}
	}
}
