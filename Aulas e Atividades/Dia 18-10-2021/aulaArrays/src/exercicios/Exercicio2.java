package exercicios;

//	2. Dado o seguinte array:  int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101,
//	125};
//	A. Retorne somente com números pares
//	B. Retorne somente com os números ímpares * 2.
public class Exercicio2 {

	public static void main(String[] args) {
		int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 100, 125};
		
		System.out.println("Números pares:");
		for(int valor : array2) {
			if(valor % 2 == 0) {
				System.out.print(valor + " ");
			}
		}
		System.out.println("\nNúmeros ímpares e seus valores multiplicados por 2:");
		for(int valor : array2) {
			if(valor % 2 != 0) {
				System.out.print(valor + " " + valor * 2 + " - ");			
			}
		}		
		
	}
}
