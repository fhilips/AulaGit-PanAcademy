package exercicios;
//	1. Faça um programa que receba três inteiros e diga qual deles é o maior e
//	qual o menor. Conseguem criar mais de uma solução?
public class Exercicio1 {

	public static void main(String[] args) {

		int n1 = 10, n2 = 40, n3 = 30;	
		
		if (n1 > n2 && n1 > n2) {
			System.out.println("O primeiro número de valor " + n1 +" é o maior");
			if (n2 < n3) {
				System.out.println("O segundo número de valor " + n2 + "é o menor");
			} else {
				System.out.println("O terceiro número de valor " + n3 +" é o menor");
			}
		} else if (n2 > n3) {
			System.out.println("O segundo número de valor " + n2 + " é o maior");
			if (n1 < n3) {
				System.out.println("O primeiro número de valor " + n1 + " é o menor");
			} else {
				System.out.println("O terceiro número de valor " + n3 + " é o menor");
			}
		} else {
			System.out.println("O terceiro número de valor " + n3 + " é o maior");
			if (n1 < n2) {
				System.out.println("O primeiro número de valor " + n1 + " é o menor");
			} else {
				System.out.println("O segundo número de valor " + n2 + " é o menor");
			}
		}
	}
}
