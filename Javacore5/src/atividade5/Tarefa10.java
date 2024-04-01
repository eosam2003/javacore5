package atividade5;

import java.util.Scanner;

public class Tarefa10 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do seu salário fixo");
		float salarioFixo = sc.nextFloat();

		System.out.println("Digite o valor de vendas efetuado pelo usuário :");
		float valorVendas = sc.nextFloat();

		if (valorVendas < 1501) {
			float salarioFinal = valorVendas / 100 * 3 + salarioFixo;
			System.out.println("O salario Final Corresponde a : R$" + salarioFinal);
		} else {
			float salarioFinal02 = (valorVendas - 1500) * 5 / 100 + (1500 * 3 / 100) + salarioFixo;
			System.out.println("O salário final do vendedor corresponde a : " + salarioFinal02);
		}

		sc.close();
	}
	
}
