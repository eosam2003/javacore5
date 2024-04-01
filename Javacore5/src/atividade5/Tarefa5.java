package atividade5;

import java.util.Scanner;

public class Tarefa5 {


	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Ano atual: ");
		int anoAtual = sc.nextInt();

		System.out.println("Digite o Ano do seu Nascimento: ");
		int anoDoNascimento = sc.nextInt();

		int idade = anoAtual - anoDoNascimento;

		if (idade >= 18) {
			System.out.println("Você pode votar");
		} else {
			System.out.println("Você não pode votar");
		}
		System.out.println("Você tem " + idade + " Anos");
		sc.close();
	}
	
}
