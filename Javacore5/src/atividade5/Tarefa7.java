package atividade5;

import java.util.Scanner;

public class Tarefa7 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Primeiro Valor: ");
		int valor01 = sc.nextInt();

		System.out.println("Digite o segundo Valor: ");
		int valor02 = sc.nextInt();

		if (valor01 > valor02) {
			System.out.println("A ordem Crescente dos numero é: " + valor02 + (",") + valor01);
		} else {
			System.out.println("A ordem Crescente dos numero é: " + valor01 + (",") + valor02);
		}

		sc.close();
	}
	
}
