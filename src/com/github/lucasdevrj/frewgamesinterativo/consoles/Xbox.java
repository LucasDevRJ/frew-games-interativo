package com.github.lucasdevrj.frewgamesinterativo.consoles;

import java.util.Scanner;

public abstract class Xbox extends Console {

	public Xbox(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		super(codigo, nome, modelo, dataLancamento, marca, preco);
	}
	
	static Scanner entrada = new Scanner(System.in);
	
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
