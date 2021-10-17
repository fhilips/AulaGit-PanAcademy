package estruturaDeControle.exercicios;

import java.util.Scanner;

//	For
//	Criar um programa que receba um numero e diga se ele e um numero primo
public class NumeroPrimo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		boolean naoEhPrimo = true;
		
		System.out.println("Digite um número inteiro (pode ser negativo):");
		numero = entrada.nextInt();
		numero = Math.abs(numero);
		
		for (int i = 2; i <= numero / 2; i++) {
		    if (numero % i == 0) {
		    	System.out.println("O número não é primo!");
		    	naoEhPrimo = false;
		        break;
		    }
		 }
		
		if(naoEhPrimo) {
			System.out.println("O número é primo!");
		}
		
		entrada.close();
	}
}
