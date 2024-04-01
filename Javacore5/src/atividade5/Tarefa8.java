package atividade5;

import java.util.Scanner;

public class Tarefa8 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora do inicio: ");
		int horaInicio = sc.nextInt();

		System.out.println("Digite a hora do fim: ");
		int horaFim = sc.nextInt();

		int resultadoDoJogo = horaFim - horaInicio;

		if (resultadoDoJogo > 0) {
			System.out.println("A partida de Xadrez durou " + resultadoDoJogo + " Horas ");
		} else {
			int resultadoDoJogoAcabadoNoDiaSeguinte = resultadoDoJogo + 24;
			System.out.println("A partida de Xadrez Durou " + resultadoDoJogoAcabadoNoDiaSeguinte + " Horas ");
		}

		sc.close();
	}
	
}
