package estruturaDeControle.exercicios;

import java.util.Scanner;

//	4. Crie um programa que recebe 10 valores e ao final imprima o maior
//	número
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, maiorNumero = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o valor %s:\n",i);
			numero = entrada.nextInt();
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		
		System.out.println("O maior valor é o " + maiorNumero);
		
		entrada.close();
	}
}
