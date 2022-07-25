package com.github.lucasdevrj.frewgamesinterativo.acessorios;

import java.util.Scanner;

import com.github.lucasdevrj.frewgamesinterativo.produto.Produto;

public class Acessorio extends Produto {

	public Acessorio(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		super(codigo, nome, modelo, dataLancamento, marca, preco);
	}
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void exibeAcessorios() {
		System.out.println("----------|ACESS�RIOS|----------");
		System.out.println("Op��o 1 - Fone.");
		
		System.out.print("Digite a op��o desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				Fone.exibeFones();
			break;
		}
	}
}
