package exerciciosCondicionais;

//	3)	Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno. Sendo que:
//	 Triângulo Equilátero: possui os 3 lados iguais.
//	 Triângulo Isóscele: possui 2 lados iguais.
//	 Triângulo Escaleno: possui 3 lados diferentes.
public class Exercicio3 {

	public static void main(String[] args) {
		int lado1 = 95, lado2 = 95, lado3 = 60;
		
		if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("É um triângulo equilátero.");		
		} else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			System.out.println("É um triângulo isósceles.");		
		} else {
			System.out.println("É um triângulo escaleno.");		
		}	
	}
}
