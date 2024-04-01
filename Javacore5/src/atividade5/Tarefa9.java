package atividade5;

import java.util.Scanner;

public class Tarefa9 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de horas Trabalhada no mes: ");
		float horasTrabalhadas = sc.nextFloat();

		System.out.println("Digite o Valor ganho Por hora: ");
		float valorGanhoPorHora = sc.nextFloat();

		if (horasTrabalhadas > 160) {
			float valorExtra = (horasTrabalhadas - 160) * (horasTrabalhadas) + (valorGanhoPorHora * 50 / 100);
			float valorSalarioComExtra = (160 * valorGanhoPorHora) + valorExtra;
			System.out.println(valorSalarioComExtra);
		} else {
			float SalarioSemHoraExtra = valorGanhoPorHora * 160;
			System.out.println(SalarioSemHoraExtra);
		}
		sc.close();
	}
	
}
