package com.github.lucasdevrj.frewgamesinterativo.loja;

import java.util.ArrayList;
import java.util.Scanner;

import com.github.lucasdevrj.frewgamesinterativo.acessorios.Acessorio;
import com.github.lucasdevrj.frewgamesinterativo.cliente.Cliente;
import com.github.lucasdevrj.frewgamesinterativo.consoles.PlayStation;
import com.github.lucasdevrj.frewgamesinterativo.consoles.Xbox;
import com.github.lucasdevrj.frewgamesinterativo.produto.Produto;

public class LojaVideoGame {

	private String nome;
	private String endereco;
	static ArrayList<Produto> produtos = new ArrayList<Produto>();
	private static float precoTotal;
	
	static Scanner entrada = new Scanner(System.in);
	Cliente cliente = new Cliente();
	
	public void exibeMensagemBoasVindas() {
		System.out.println("Qual é o seu nome?");
		System.out.print("Digite seu nome: ");
		cliente.setNome(entrada.next());
		
		System.out.println("\nOlá " + cliente.getNome() + ", seja bem-vindo a loja " + getNome() + "!");
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
			
			case 3:
				Acessorio.exibeAcessorios();
			break;
			
			case 4:
				comprar();
			break;
			
			case 5:
				exibeProdutosCarrinho();
			break;
			
			case 6:
				finalizarPrograma();
			break;
		}
	}
	
	public static void exibeMenuJogos() {
		System.out.println("\n----------|MENU DE JOGOS|----------");
		System.out.println("Opção 1 - Jogos de PlayStation.");
		System.out.println("Opção 2 - Jogos de Xbox.");
		System.out.println("Opção 3 - Jogos de Nintendo.");
		System.out.println("Opção 4 - Voltar.");
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
			
			case 4:
				exibeMenu();
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
				Xbox.exibeConsolesXbox();
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
			for (int i = 0; i < getProdutos().size(); i++) {
				precoTotal += getProdutos().get(i).getPreco();
				System.out.println("Jogo: " + produtos.get(i).getNome());
				System.out.printf("\nPreço: R$%.2f", produtos.get(i).getPreco());
				System.out.println();
			} 
			System.out.println("Valor total: R$ " + precoTotal);
			
			System.out.println("\nQual será a forma de pagamento:");
			System.out.println("Opção 1 - Dinheiro (10% de desconto).");
			System.out.println("Opção 2 - Cartão de Crédito.");
			
			System.out.print("Digite a opção desejada: ");
			int opcao = entrada.nextInt();
			
			if (opcao == 1) {
				float desconto = precoTotal - (precoTotal * 0.10f);
				double notaFiscal = Math.random() * 10;
				System.out.println("Nota Fiscal: " + notaFiscal);
				System.out.printf("\nValor total: R$ %.2f", precoTotal);
				System.out.printf("\nValor a pagar: R$ %.2f", desconto);
				
			} else if (opcao == 2) {
				System.out.print("\nDeseja parcelar em quantas vezes (até 12x): ");
				int vezes = entrada.nextInt();
				
				while (vezes <= 0 || vezes > 12) {
					System.out.println("Número de parcelas inválido!");
					System.out.print("\nDeseja parcelar em quantas vezes (até 12x): ");
					vezes = entrada.nextInt();
				}
				
				float valorParcelado = precoTotal / vezes;
				
				System.out.println("Compra efetuada com sucesso!");
				System.out.println("Número de parcelas: " + vezes);
				System.out.printf("\nValor parcelado: R$ %.2f", valorParcelado);
			}
			
			System.out.println("\nObrigado e volte sempre!");
			exibeMenu();
			
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
				
			} else if (opcao == 2) {
				getProdutos().clear();
				System.out.println("Todos os produtos foram removidos!");
				exibeMenu();
				
			} else if (opcao == 3) {
				exibeMenu();
			}
			
			exibeMenu();
		} else {
			System.out.println("\nCarrinho esta vazio!");
			exibeMenu();
		}
	}
	
	public static void finalizarPrograma() {
		System.out.println("\nVolte sempre!");
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
