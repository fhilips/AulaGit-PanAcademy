package exercicios;

//	2. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que 
//	diga se ela poder� ou n�o votar este ano
//	(n�o	�	necess�rio	considerar	o	m�s	em	que	ela nasceu).
public class Exercicio2 {
	public static void main(String[] args) {
		int anoAtual = 2021, anoNascimento = 1952;
		int idade = anoAtual - anoNascimento;

		if (idade < 16) {
			System.out.println("Voc� n�o est� apto a votar!");
		} else if ((idade >= 16 && idade < 18) || idade > 70) {
			System.out.println("Seu voto � facultativo!");
		} else {
			System.out.println("Voc� est� apto a votar!");
		}
	}
}
