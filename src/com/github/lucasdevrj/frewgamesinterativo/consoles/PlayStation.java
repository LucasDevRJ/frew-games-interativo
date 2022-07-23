package com.github.lucasdevrj.frewgamesinterativo.consoles;

import java.util.Scanner;

public abstract class PlayStation extends Console {
	
	static Scanner entrada = new Scanner(System.in);

	public PlayStation(String nome, String processador, int armazenamento, String cor, float preco) {
		super(nome, processador, armazenamento, cor, preco);
	}
	
	public static void exibeJogosPlayStation() {
		System.out.println("\n----------|JOGOS DE PLAYSTATION|----------");
		System.out.println("Op��o 1 - Jogos de PlayStation 3.");
		System.out.println("Op��o 2 - Jogos de PlayStation 4.");
		System.out.println("Op��o 3 - Jogos de PlayStation 5.");
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
		}
	}

}
