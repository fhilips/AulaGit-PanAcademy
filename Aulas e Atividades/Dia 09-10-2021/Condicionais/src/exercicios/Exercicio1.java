package exercicios;
//	1. Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior e
//	qual o menor. Conseguem criar mais de uma solu��o?
public class Exercicio1 {

	public static void main(String[] args) {

		int n1 = 10, n2 = 40, n3 = 30;	
		
		if (n1 > n2 && n1 > n2) {
			System.out.println("O primeiro n�mero de valor " + n1 +" � o maior");
			if (n2 < n3) {
				System.out.println("O segundo n�mero de valor " + n2 + "� o menor");
			} else {
				System.out.println("O terceiro n�mero de valor " + n3 +" � o menor");
			}
		} else if (n2 > n3) {
			System.out.println("O segundo n�mero de valor " + n2 + " � o maior");
			if (n1 < n3) {
				System.out.println("O primeiro n�mero de valor " + n1 + " � o menor");
			} else {
				System.out.println("O terceiro n�mero de valor " + n3 + " � o menor");
			}
		} else {
			System.out.println("O terceiro n�mero de valor " + n3 + " � o maior");
			if (n1 < n2) {
				System.out.println("O primeiro n�mero de valor " + n1 + " � o menor");
			} else {
				System.out.println("O segundo n�mero de valor " + n2 + " � o menor");
			}
		}
	}
}
