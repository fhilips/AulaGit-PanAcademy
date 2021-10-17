package estruturaDeControle.exercicios;

import java.util.Scanner;

//	3. Criar um programa que receba uma palavra e em seguida imprime no
//	console letra por letra.
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palavra;
		
		System.out.println("Digite uma palavra:");
		palavra = entrada.nextLine();
		
		for (String letra : palavra.split("")) {
			System.out.println(letra);
		}
		
		entrada.close();		
	}
}
