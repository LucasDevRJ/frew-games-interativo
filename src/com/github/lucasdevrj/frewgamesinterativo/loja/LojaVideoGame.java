package com.github.lucasdevrj.frewgamesinterativo.loja;

import java.util.ArrayList;
import java.util.Scanner;

import com.github.lucasdevrj.frewgamesinterativo.jogos.Jogo;

public class LojaVideoGame {

	private String nome;
	private String endereco;
	ArrayList<Jogo> jogos = new ArrayList<Jogo>();
	
	Scanner entrada = new Scanner(System.in);
	
	public void exibeMensagemBoasVindas() {
		System.out.println("Ol�, seja bem-vindo a loja " + getNome() + "!");
		System.out.println("Estamos localizados na " + getEndereco() + ".");
		exibeMenu();
	}
	
	public void exibeMenu() {
		System.out.println("\n----------|MENU PRINCIPAL|----------");
		System.out.println("Op��o 1 - Jogos.");
		System.out.println("Op��o 2 - Consoles.");
		System.out.println("Op��o 3 - Acess�rios.");
		System.out.println("Op��o 4 - Comprar.");
		System.out.println("Op��o 5 - Ver carrinho.");
		System.out.println("Op��o 6 - Sair.");
		
		System.out.print("Digite a sua op��o: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				exibeMenuJogos();
			break;
		}
	}
	
	public void exibeMenuJogos() {
		System.out.println("\n----------|MENU DE JOGOS|----------");
		System.out.println("Op��o 1 - Jogos de PlayStation.");
		System.out.println("Op��o 2 - Jogos de Xbox.");
		System.out.println("Op��o 3 - Jogos de Nintendo.");
		
		System.out.print("Digite a sua op��o: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				exibeJogosPlayStation();
			break;
		}
	}
	
	public void exibeJogosPlayStation() {
		System.out.println("\n----------|JOGOS DE PLAYSTATION|----------");
		System.out.println("Op��o 1 - Jogos de PlayStation 3.");
		System.out.println("Op��o 2 - Jogos de PlayStation 4.");
		System.out.println("Op��o 3 - Jogos de PlayStation 5.");
		
		System.out.print("Digite a op��o desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
			exibeJogosPlayStation3();
			break;
		}
	}
	
	public void exibeJogosPlayStation3() {
		System.out.println("\n----------|JOGOS DE PLAYSTATION 3|----------");
		System.out.println("Op��o 1 - Grand Theft Auto V.");
		System.out.println("Op��o 2 - Mortal Kombat Komplete Edition.");
		System.out.println("Op��o 3 - God of War Collection.");
		System.out.println("Op��o 4 - Jogo Metal Gear Solid 4: Guns of the Patriots.");
		System.out.println("Op��o 5 - Call of Duty: Black Ops.");
		
		System.out.print("Digite a op��o desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				System.out.println("\nDeseja adicionar o jogo no carrinho?");
				System.out.println("Op��o 1 - Sim.");
				System.out.println("Op��o 2 - Volta para o menu principal.");
				System.out.print("Digite sua op��o: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					System.out.println("\nJogo adicionado no carrinho!");
					Jogo jogo = new Jogo("Grand Theft Auto V", "10/05/2015", "A��o e Aventura", "TAKE-TWO", "PlayStation", 90.00f);
					this.getJogos().add(jogo);
					exibeMenu();
					
				} else if (opcao == 2) {
					exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosPlayStation3();
				}
				
			break;
			
			case 2:
				System.out.println("\nDeseja adicionar o jogo no carrinho?");
				System.out.println("Op��o 1 - Sim.");
				System.out.println("Op��o 2 - Volta para o menu principal.");
				System.out.print("Digite sua op��o: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					System.out.println("\nJogo adicionado no carrinho!");
					Jogo jogo = new Jogo("Mortal Kombat Komplete Edition", "13/02/2011","Luta", " NetherRealm Studios", "PlayStation", 120.00f);
					this.getJogos().add(jogo);
					exibeMenu();
					
				} else if (opcao == 2) {
					exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosPlayStation3();
				}
				
			break;
			
			case 3:
				
				System.out.println("\nDeseja adicionar o jogo no carrinho?");
				System.out.println("Op��o 1 - Sim.");
				System.out.println("Op��o 2 - Volta para o menu principal.");
				System.out.print("Digite sua op��o: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					System.out.println("\nJogo adicionado no carrinho!");
					Jogo jogo = new Jogo("God of War Collection", "13/11/2009","A��o e Aventura", "Sony", "PlayStation", 100.00f);
					this.getJogos().add(jogo);
					exibeMenu();
					
				} else if (opcao == 2) {
					exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosPlayStation3();
				}
			
			break;
			
			case 4:
				
				System.out.println("\nDeseja adicionar o jogo no carrinho?");
				System.out.println("Op��o 1 - Sim.");
				System.out.println("Op��o 2 - Volta para o menu principal.");
				System.out.print("Digite sua op��o: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					System.out.println("\nJogo adicionado no carrinho!");
					Jogo jogo = new Jogo("Jogo Metal Gear Solid 4: Guns of the Patriots", "05/07/2008","A��o e Aventura", "KONAMI", "PlayStation", 110.00f);
					this.getJogos().add(jogo);
					exibeMenu();
					
				} else if (opcao == 2) {
					exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosPlayStation3();
				}
				
			break;
			
			case 5:
				
				System.out.println("\nDeseja adicionar o jogo no carrinho?");
				System.out.println("Op��o 1 - Sim.");
				System.out.println("Op��o 2 - Volta para o menu principal.");
				System.out.print("Digite sua op��o: ");
				opcao = entrada.nextInt();
				
				if (opcao == 1) {
					System.out.println("\nJogo adicionado no carrinho!");
					Jogo jogo = new Jogo("Call of Duty: Black Ops", "05/07/2010","A��o e Aventura", "Activision", "PlayStation", 82.00f);
					this.getJogos().add(jogo);
					exibeMenu();
					
				} else if (opcao == 2) {
					exibeMenu();
					
				} else {
					System.out.println("Op��o inv�lida!");
					exibeJogosPlayStation3();
				}
			
			break;
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
	
	public ArrayList<Jogo> getJogos() {
		return jogos;
	}
}
