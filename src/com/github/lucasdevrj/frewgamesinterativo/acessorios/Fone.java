package com.github.lucasdevrj.frewgamesinterativo.acessorios;

import com.github.lucasdevrj.frewgamesinterativo.loja.LojaVideoGame;

public class Fone extends Acessorio {

	public Fone(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		super(codigo, nome, modelo, dataLancamento, marca, preco);
	}
	
	public static void exibeFones() {
		System.out.println("----------|FONES|----------");
		System.out.println("Opção 1 - Black Shark Fone.");
		System.out.println("Opção 2 - BUTFULAKE.");
		System.out.println("Opção 3 - Orzly.");
		System.out.println("Opção 4 - Voltar.");
		System.out.println("---------------------------");
		
		System.out.print("Digite a opção desejada: ");
		int opcao = entrada.nextInt();
		
		if (opcao == 1) {
			Fone fone = new Fone(1101, "Black Shark", "Goblin X1" , "19/11/2021", "Black Shark", 100.00f);
			System.out.println("Produto adicionado no carrinho!");
			LojaVideoGame.getProdutos().add(fone);
			LojaVideoGame.exibeMenu();
		} else if (opcao == 2) {
			Fone fone = new Fone(1102, "BUTFULAKE", "GH-1" , "20/03/2019", "BUTFULAKE", 120.00f);
			System.out.println("Produto adicionado no carrinho!");
			LojaVideoGame.getProdutos().add(fone);
			LojaVideoGame.exibeMenu();
		} else if (opcao == 3) {
			Fone fone = new Fone(1103, "Orzly", "Hornet RXH-20" , "06/10/2020", "Orzly", 110.00f);
			System.out.println("Produto adicionado no carrinho!");
			LojaVideoGame.getProdutos().add(fone);
			LojaVideoGame.exibeMenu();
		} else if (opcao == 4) {
			LojaVideoGame.exibeMenu();
		}
	}
}
