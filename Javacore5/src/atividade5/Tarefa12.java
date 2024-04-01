package atividade5;

import java.util.Scanner;

public class Tarefa12 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a Quantidade Atual em Estoque do Produto: ");
		float quantidadeEstoque = sc.nextFloat();

		System.out.println("Digite a Quantidade Maxima do Estoque: ");
		float maximoEstoque = sc.nextFloat();

		System.out.println("Digite a Quantidade Minima do Estoque: ");
		float minimoEstoque = sc.nextFloat();

		float quantidadeMedia = (maximoEstoque + minimoEstoque) / 2;

		if (quantidadeEstoque >= quantidadeMedia) {
			System.out.println("Não Efetuar Compra");
		} else {
			System.out.println("Efetuar Compra");
		}

		sc.close();
	}
	
}
