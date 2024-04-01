package atividade5;

import java.util.Scanner;

public class Tarefa1 {


	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Valor : ");
		int valor10 = sc.nextInt();

		if (valor10 > 10) {
			System.out.println("E maior que 10 o valor Digitado");
		} else {
			System.out.println("E menor que 10 o valor Digitado");
		}

		sc.close();
	}
	
}
