package estruturaDeControle.exercicios;

import java.util.Scanner;

//	2. Criar um programa que, enquanto estiver recebendo números positivos,
//	imprime no console a soma dos números inseridos, caso receba um
//	número negativo, encerre o programa. Tente utilizar a estrutura do while.
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, total = 0;		
		
		do {
			System.out.println("Digite um número positivo (ou um negativo para cancelar):");
			numero = entrada.nextInt();
			if(numero > 0) {
				total += numero;
				System.out.println("Total = " + total);
			}
			
		} while(numero > 0);
		
		System.out.println("Programa cancelado!");
		
		entrada.close();
	}
	
}
