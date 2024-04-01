package atividade5;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[]Args) {
		
	Scanner sc = new Scanner (System.in);	
		
		
	System.out.println("Digite o valor de numero de Maças Compradas: ");
	float quantidadeMaças = sc.nextFloat();
	
	float maçasMenos12 = 1.30f;
	float maçasMaior12 = 1;	
	
	if(quantidadeMaças >= 12) {
		float resultado = quantidadeMaças*maçasMaior12;
		System.out.println("O valor da compra Foi: R$ "+resultado);
	}else {
		float resultado02 = quantidadeMaças*maçasMenos12;
		System.out.println("O valor da Compra Foi: R$ "+resultado02);
	}
	System.out.println("O numero de maças Compradas foram "+quantidadeMaças);
	
	
	sc.close();	
	}
	
}
