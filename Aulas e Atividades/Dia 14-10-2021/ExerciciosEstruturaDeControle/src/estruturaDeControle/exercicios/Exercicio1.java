package estruturaDeControle.exercicios;

import java.util.Random;
import java.util.Scanner;

//	1. Jogo da adivinha��o: Tentar adivinhar um n�mero entre 0 - 100.
//	Armazene um n�mero aleatorio em uma variaavel. O jogador tem 10
//	tentativas para adivinhar o numero gerado. Ao final de cada tentativa,
//	imprima a quantidade de tentativas restantes, e imprima se o n�mero
//	inserido e maior ou menor do que o numero armazenado.
//	- Caso deseje, utilize o m�todo Random() da cole��o java util para sortear o
//	n�mero:
//  import java.util.Random;
//	Random numeroAleatorio = new Random();
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroCorreto = new Random().nextInt(100);
		int numero;
		boolean acertouONumero = false;
		
	//	System.out.println(numeroCorreto);
		System.out.println("Exerc�cio - Adivinhe o n�mero\n");
		System.out.println("Vamos l�, voc� s� tem 10 tentativas!");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite um n�mero entre 0 e 100:");
			
			numero = entrada.nextInt();
			
			while(numero < 0 || numero > 100) {
				System.out.println("O n�mero deve estar entre 0 e 100!");
				System.out.println("Digite um n�mero entre 0 e 100:");
				numero = entrada.nextInt();
			}
						
			if(numero == numeroCorreto) {
				System.out.println("Parab�ns! Voc� acertou o n�mero! " + numero);
				acertouONumero = true;
				break;
			} else {
				System.out.println("N�mero errado! Voc� agora tem " + (10 - i) + " tentativas!");
				if(i < 10) {
					if(numero < numeroCorreto) {
						System.out.printf("Dica: o n�mero correto � maior do que %s\n",numero);					
					} else {
						System.out.printf("Dica: o n�mero correto � menor do que %s\n",numero);
					}
				}
				
			}
		}
		
		if(!acertouONumero) {
			System.out.println("Infelizmente voc� n�o conseguiu acertar! Tente novamente :)");
		}
				
		entrada.close();	
	}
	
}
