package com.github.lucasdevrj.frewgamesinterativo.consoles;

public class PlayStation4 extends Console {

	public PlayStation4(String nome, String processador, int armazenamento, String cor, float preco) {
		super(nome, processador, armazenamento, cor, preco);
	}
	
	public static void exibeJogosPlayStation4() {
		System.out.println("\n----------|JOGOS DE PLAYSTATION 4|----------");
		System.out.println("Opção 1 - Grand Theft Auto V.");
		System.out.println("Opção 2 - Mortal Kombat Komplete Edition.");
		System.out.println("Opção 3 - God of War Collection.");
		System.out.println("Opção 4 - Jogo Metal Gear Solid 4: Guns of the Patriots.");
		System.out.println("Opção 5 - Call of Duty: Black Ops.");
		System.out.println("----------------------------------------------");
		
		System.out.print("Digite a opção desejada: ");
//		int opcao = entrada.nextInt();
	}

}
