package com.github.lucasdevrj.frewgamesinterativo.acessorios;

public class Fone extends Acessorio {

	public Fone(int codigo, String nome, String modelo, String dataLancamento, String marca, float preco) {
		super(codigo, nome, modelo, dataLancamento, marca, preco);
	}
	
	public static void exibeFones() {
		System.out.println("----------|FONES|----------");
		System.out.println("Op��o 1 - Black Shark Fone.");
		System.out.println("Op��o 2 - BUTFULAKE.");
		System.out.println("Op��o 3 - Orzly.");
		System.out.println("---------------------------");
	}
}
