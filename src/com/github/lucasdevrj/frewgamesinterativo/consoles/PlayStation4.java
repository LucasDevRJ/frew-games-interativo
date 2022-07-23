package com.github.lucasdevrj.frewgamesinterativo.consoles;

import java.util.Scanner;

public class PlayStation4 extends Console {
	
	static Scanner entrada = new Scanner(System.in);

	public PlayStation4(String nome, String processador, int armazenamento, String cor, float preco) {
		super(nome, processador, armazenamento, cor, preco);
	}
	
	public static void exibeJogosPlayStation4() {
		System.out.println("\n----------|JOGOS DE PLAYSTATION 4|----------");
		System.out.println("Op��o 1 - Marvel's Spider-Man: Miles Morales.");
		System.out.println("Op��o 2 - The Last of Us Part II.");
		System.out.println("Op��o 3 - God of War Collection.");
		System.out.println("Op��o 4 - Red Dead Redemption 2.");
		System.out.println("Op��o 5 - Days Gone.");
		System.out.println("----------------------------------------------");
		
		System.out.print("Digite a op��o desejada: ");
		int opcao = entrada.nextInt();
	}

}
