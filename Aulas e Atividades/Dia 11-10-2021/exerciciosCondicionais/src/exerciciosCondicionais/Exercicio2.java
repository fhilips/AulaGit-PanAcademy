package exerciciosCondicionais;
import java.util.Scanner;

//	2)	Fa�a um  algoritmo que escreva as seguintes mensagens :
//	 Caso o n�mero de lados seja inferior a 3 escrever N�O � UM POL�GONO.
//	 Caso o n�mero de lados seja superior a 5 escrever POL�GONO N�O IDENTIFICADO

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lados = 0;
		
		System.out.println("Digite o número de lados:");
		lados = sc.nextInt();
		
//		Solu��o considerando quando o n�mero de lados � 3 ou 4
//			if(lados < 3) {
//				System.out.println("N�O � UM POL�GONO.");
//			} else if(lados == 3) {
//				System.out.println("N�O UM TRI�NGULO ");
//			} else if(lados == 4) {
//				System.out.println("N�O UM QUADRIL�TERO");
//			} else if(lados > 5) {
//				System.out.println("POL�GONO N�O IDENTIFICADO");
//			}
		
		if(lados < 3) {
			System.out.println("N�O � UM POL�GONO.");
		} else if(lados > 5) {			
			System.out.println("POL�GONO N�O IDENTIFICADO.");
		}
		
		sc.close();		
	}

}
