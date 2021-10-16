package exerciciosCondicionais;
import java.util.Scanner;

//	2)	Faça um  algoritmo que escreva as seguintes mensagens :
//	 Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
//	 Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lados = 0;
		
		System.out.println("Digite o nÃºmero de lados:");
		lados = sc.nextInt();
		
//		Solução considerando quando o número de lados é 3 ou 4
//			if(lados < 3) {
//				System.out.println("NÃO É UM POLÍGONO.");
//			} else if(lados == 3) {
//				System.out.println("NÃO UM TRIÂNGULO ");
//			} else if(lados == 4) {
//				System.out.println("NÃO UM QUADRILÁTERO");
//			} else if(lados > 5) {
//				System.out.println("POLÍGONO NÃO IDENTIFICADO");
//			}
		
		if(lados < 3) {
			System.out.println("NÃO É UM POLÍGONO.");
		} else if(lados > 5) {			
			System.out.println("POLÍGONO NÃO IDENTIFICADO.");
		}
		
		sc.close();		
	}

}
