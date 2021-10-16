package exercicios;
import java.util.Scanner;


//	Fa�a um programa que pede duas notas de um aluno. Em seguida ele deve calcular a m�dia do aluno e dar o seguinte resultado:
//		  A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
//		  A mensagem "Reprovado", se a m�dia for menor do que sete;
//		  A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.
public class Exercicio4 {

	public static void main(String[] args) {
		double nota1 = 0, nota2 = 0, media = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Digite a primeira nota (deve ser menor do que 10 e maior do que 0): ");
			nota1 = sc.nextDouble();
		} while (nota1 > 10 || nota1 < 0);

		do {
			System.out.println("Digite a segunda nota (deve ser menor do que 10 e maior do que 0): ");
			nota2 = sc.nextDouble();
		} while (nota2 > 10 || nota2 < 0);

		media = (nota1 + nota2) / 2;
		System.out.println("A media do aluno �: " + media);

		if (media == 10) {
			System.out.println("Aprovado com Distin��o");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		sc.close();
	}

}
