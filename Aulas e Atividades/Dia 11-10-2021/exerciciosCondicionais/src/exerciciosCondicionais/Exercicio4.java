package exerciciosCondicionais;
import java.util.Scanner;

//	4)	As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem
//	compradas pelo menos doze.
//	Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int macas;
		
		System.out.println("Digite o número de maças compradas:");
		macas = sc.nextInt();
		
		if(macas < 12) {
			System.out.printf("Valor total da compra: R$ %.2f", (macas * 0.3));
		} else {
			System.out.printf("Valor total da compra: R$ %.2f", (macas * 0.25));
		} 
		
		sc.close();		
	}
}
