package exercicios;

//	Dado o seguinte array: int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
//	A. Retorno o valor total da soma de todos os elementos com foreach
//	B. Retorne a média de todos os elementos
//	C. Retorne o maior valor e o menor elemento
public class Exercicio1 {
	public static void main(String[] args) {

		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int maiorValor = 0, menorValor = array[0];
		double total = 0.0;
				
		for(int valor : array) {
			System.out.println();
			total += valor;
			if(valor > maiorValor) {
				maiorValor = valor;
			}
			if(valor < menorValor) {
				menorValor = valor;
			}
		}
		
		System.out.println("A. O valor total da soma de todos os elementos: " + total);
		System.out.println("B. A média de todos os elementos: " + total / array.length);
		System.out.printf("C. O maior valor é %s e o menor valor é %s", maiorValor, menorValor);
		
	}
}
