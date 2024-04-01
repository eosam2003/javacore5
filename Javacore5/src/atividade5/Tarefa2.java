package atividade5;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[]Args) {
		
	Scanner sc = new Scanner (System.in);	
		
	System.out.println("Digite um valor: ");
	int valorPositivoOuNegativo = sc.nextInt();
	
	if(valorPositivoOuNegativo >= 0){
		System.out.println("O seu numero e Positivo");
	}else {
		System.out.println("O seu numero e Negativo");
	}
	
	sc.close();
	}
	
}
