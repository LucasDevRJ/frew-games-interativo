package com.github.lucasdevrj.frewgamesinterativo.loja;

import java.util.ArrayList;
import java.util.Scanner;

import com.github.lucasdevrj.frewgamesinterativo.consoles.PlayStation;
import com.github.lucasdevrj.frewgamesinterativo.produto.Produto;

public class LojaVideoGame {

	private String nome;
	private String endereco;
	static ArrayList<Produto> produtos = new ArrayList<Produto>();
	private static float precoTotal;
	
	static Scanner entrada = new Scanner(System.in);
	
	public void exibeMensagemBoasVindas() {
		System.out.println("Ol�, seja bem-vindo a loja " + getNome() + "!");
		System.out.println("Estamos localizados na " + getEndereco() + ".");
		exibeMenu();
	}
	
	public static void exibeMenu() {
		System.out.println("\n----------|MENU PRINCIPAL|----------");
		System.out.println("Op��o 1 - Jogos.");
		System.out.println("Op��o 2 - Consoles.");
		System.out.println("Op��o 3 - Acess�rios.");
		System.out.println("Op��o 4 - Comprar.");
		System.out.println("Op��o 5 - Ver carrinho.");
		System.out.println("Op��o 6 - Sair.");
		
		System.out.println("-------------------------------------");
		
		System.out.print("Digite a sua op��o: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				exibeMenuJogos();
			break;
			
			case 2:
				exibeMenuConsoles();
			break;
			
			case 4:
				comprar();
			break;
			
			case 5:
				exibeProdutosCarrinho();
			break;
		}
	}
	
	public static void exibeMenuJogos() {
		System.out.println("\n----------|MENU DE JOGOS|----------");
		System.out.println("Op��o 1 - Jogos de PlayStation.");
		System.out.println("Op��o 2 - Jogos de Xbox.");
		System.out.println("Op��o 3 - Jogos de Nintendo.");
		System.out.println("-------------------------------------");
		
		System.out.print("Digite a sua op��o: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				PlayStation.exibeJogosPlayStation();
			break;
		}
	}
	
	public static void exibeMenuConsoles() {
		System.out.println("\n----------|MENU DE CONSOLES|----------");
		System.out.println("Op��o 1 - PlayStation.");
		System.out.println("Op��o 2 - Xbox.");
		System.out.println("Op��o 3 - Nintendo.");
		System.out.println("-------------------------------------");
		
		System.out.print("Digite a sua op��o: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				PlayStation.exibeConsolesPlayStation();
			break;
		}
	}
	
	public static void comprar() {
		System.out.println("\n----------|COMPRAS|----------");
		if (!getProdutos().isEmpty()) {
			System.out.println("Nota Fiscal");
			for (int i = 0; i < getProdutos().size(); i++) {
				precoTotal += getProdutos().get(i).getPreco();
				System.out.println("Jogo: " + produtos.get(i).getNome());
				System.out.println("Pre�o: " + produtos.get(i).getPreco());
				System.out.println();
			} 
			System.out.println("Valor total: R$ " + precoTotal);
		} else {
			System.out.println("\nN�o tem nada no carrinho!");
			exibeMenu();
		}
	}
	
	public static void exibeProdutosCarrinho() {
		if (!getProdutos().isEmpty()) {
			System.out.println("----------|CARRINHO|---------");
			for (int i = 0; i < getProdutos().size(); i++) {
				precoTotal += getProdutos().get(i).getPreco();
				System.out.println("Nome do produto: " + getProdutos().get(i).getNome());
				System.out.println("C�digo do produto: " + getProdutos().get(i).getCodigo());
				System.out.println("Pre�o do produto: " + getProdutos().get(i).getPreco());
				System.out.println();
			} 
			System.out.printf("Pre�o total dos produtos: R$ %.2f", precoTotal);
			System.out.println("\n----------------------------");
		} else {
			System.out.println("Carrinho esta vazio!");
			exibeMenu();
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
}
