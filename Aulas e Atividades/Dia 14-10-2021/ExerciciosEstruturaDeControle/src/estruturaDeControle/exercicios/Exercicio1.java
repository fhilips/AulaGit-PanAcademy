package estruturaDeControle.exercicios;

import java.util.Random;
import java.util.Scanner;

//	1. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
//	Armazene um número aleatorio em uma variaavel. O jogador tem 10
//	tentativas para adivinhar o numero gerado. Ao final de cada tentativa,
//	imprima a quantidade de tentativas restantes, e imprima se o número
//	inserido e maior ou menor do que o numero armazenado.
//	- Caso deseje, utilize o método Random() da coleção java util para sortear o
//	número:
//  import java.util.Random;
//	Random numeroAleatorio = new Random();
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroCorreto = new Random().nextInt(100);
		int numero;
		boolean acertouONumero = false;
		
	//	System.out.println(numeroCorreto);
		System.out.println("Exercício - Adivinhe o número\n");
		System.out.println("Vamos lá, você só tem 10 tentativas!");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite um número entre 0 e 100:");
			
			numero = entrada.nextInt();
			
			while(numero < 0 || numero > 100) {
				System.out.println("O número deve estar entre 0 e 100!");
				System.out.println("Digite um número entre 0 e 100:");
				numero = entrada.nextInt();
			}
						
			if(numero == numeroCorreto) {
				System.out.println("Parabéns! Você acertou o número! " + numero);
				acertouONumero = true;
				break;
			} else {
				System.out.println("Número errado! Você agora tem " + (10 - i) + " tentativas!");
				if(i < 10) {
					if(numero < numeroCorreto) {
						System.out.printf("Dica: o número correto é maior do que %s\n",numero);					
					} else {
						System.out.printf("Dica: o número correto é menor do que %s\n",numero);
					}
				}
				
			}
		}
		
		if(!acertouONumero) {
			System.out.println("Infelizmente você não conseguiu acertar! Tente novamente :)");
		}
				
		entrada.close();	
	}
	
}
