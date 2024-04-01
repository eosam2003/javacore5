package atividade5;

import java.util.Scanner;

public class Tarefa11 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero da Conta: ");
		float contaCliente = sc.nextFloat();

		System.out.println("Digite o Saldo da Conta - " + contaCliente + " : ");
		float saldoEmConta = sc.nextFloat();

		System.out.println("Digite o Seu Debito: ");
		float debitoDaConta = sc.nextFloat();

		System.out.println("Digite o seu credito Disponivel: ");
		float creditoEmConta = sc.nextFloat();

		float saldoAtual = (saldoEmConta - debitoDaConta) + creditoEmConta;

		System.out.println("Cliente : " + contaCliente);
		System.out.println("Saldo da Conta : R$" + saldoEmConta);
		System.out.println("Debito da Conata: R$" + debitoDaConta);

		if (saldoAtual >= 0) {
			System.out.println("O saldo da Conta " + contaCliente + " e POSITIVA.");
		} else {
			System.out.println("O saldo da conta " + contaCliente + " e NEGATIVA");
		}

		sc.close();
	}
	
}
