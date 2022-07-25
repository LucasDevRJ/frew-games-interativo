package com.github.lucasdevrj.frewgamesinterativo.loja;

import java.util.ArrayList;
import java.util.Scanner;

import com.github.lucasdevrj.frewgamesinterativo.consoles.PlayStation;
import com.github.lucasdevrj.frewgamesinterativo.consoles.Xbox;
import com.github.lucasdevrj.frewgamesinterativo.produto.Produto;

public class LojaVideoGame {

	private String nome;
	private String endereco;
	static ArrayList<Produto> produtos = new ArrayList<Produto>();
	private static float precoTotal;
	
	static Scanner entrada = new Scanner(System.in);
	
	public void exibeMensagemBoasVindas() {
		System.out.println("Olá, seja bem-vindo a loja " + getNome() + "!");
		System.out.println("Estamos localizados na " + getEndereco() + ".");
		exibeMenu();
	}
	
	public static void exibeMenu() {
		System.out.println("\n----------|MENU PRINCIPAL|----------");
		System.out.println("Opção 1 - Jogos.");
		System.out.println("Opção 2 - Consoles.");
		System.out.println("Opção 3 - Acessórios.");
		System.out.println("Opção 4 - Comprar.");
		System.out.println("Opção 5 - Ver carrinho.");
		System.out.println("Opção 6 - Sair.");
		
		System.out.println("-------------------------------------");
		
		System.out.print("Digite a sua opção: ");
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
		System.out.println("Opção 1 - Jogos de PlayStation.");
		System.out.println("Opção 2 - Jogos de Xbox.");
		System.out.println("Opção 3 - Jogos de Nintendo.");
		System.out.println("-------------------------------------");
		
		System.out.print("Digite a sua opção: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				PlayStation.exibeJogosPlayStation();
			break;
			
			case 2:
				Xbox.exibeJogosXbox();
			break;
		}
	}
	
	public static void exibeMenuConsoles() {
		System.out.println("\n----------|MENU DE CONSOLES|----------");
		System.out.println("Opção 1 - PlayStation.");
		System.out.println("Opção 2 - Xbox.");
		System.out.println("Opção 3 - Nintendo.");
		System.out.println("Opção 4 - Voltar.");
		System.out.println("-------------------------------------");
		
		System.out.print("Digite a sua opção: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				PlayStation.exibeConsolesPlayStation();
			break;
			
			case 2:
				
			break;
			
			case 4:
				exibeMenu();
			break;
			
			default:
				System.out.println("Opção inválida!");
				exibeMenuConsoles();
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
				System.out.printf("\nPreço: R$%.2f", produtos.get(i).getPreco());
				System.out.println();
			} 
			System.out.println("Valor total: R$ " + precoTotal);
		} else {
			System.out.println("\nNão tem nada no carrinho!");
			exibeMenu();
		}
	}
	
	public static void exibeProdutosCarrinho() {
		if (!getProdutos().isEmpty()) {
			System.out.println("\n----------|CARRINHO|---------");
			for (int i = 0; i < getProdutos().size(); i++) {
				precoTotal += getProdutos().get(i).getPreco();
				System.out.println("Nome do produto: " + getProdutos().get(i).getNome());
				System.out.println("Código do produto: " + getProdutos().get(i).getCodigo());
				System.out.println("Preço do produto: " + getProdutos().get(i).getPreco());
				System.out.println();
			} 
			System.out.printf("Preço total dos produtos: R$ %.2f", precoTotal);
			System.out.println("\n----------------------------");
			
			System.out.println("Deseja remover algum produto do carrinho?");
			System.out.println("Opção 1 - Remover 1 produto.");
			System.out.println("Opção 2 - Remover todos os produtos.");
			System.out.println("Opção 3 - Voltar.");
			System.out.print("Digite sua opção: ");
			int opcao = entrada.nextInt();
			
			System.out.println("\nProdutos no carrinho.");
			if (opcao == 1) {
				for (int i = 0;  i < getProdutos().size(); i++) {
					System.out.println("Nome do produto: " + getProdutos().get(i).getNome());
					System.out.println("Código do produto: " + getProdutos().get(i).getCodigo());
					System.out.println("Preço do produto: " + getProdutos().get(i).getPreco());
					System.out.println();
					
				}
				
				for (int i = 0; i < getProdutos().size(); i++) {
					System.out.print("Digite o código do produto que deseja remover: ");
					int codigo = entrada.nextInt();
					
					while (codigo != getProdutos().get(i).getCodigo()) {
						System.out.println("Código inválido!");
						System.out.print("Digite o código do produto que deseja remover: ");
					}
					
					if (codigo == getProdutos().get(i).getCodigo()) {
						getProdutos().remove(i);
						System.out.println("Produto removido do carrinho!");
						exibeMenu();
					}
				}
			}
			exibeMenu();
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
