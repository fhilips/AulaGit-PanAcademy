package exerciciosCondicionais;

//	3)	Escreva um programa que leia as medidas dos lados de um tri�ngulo e escreva se ele � Equil�tero, Is�sceles ou Escaleno. Sendo que:
//	 Tri�ngulo Equil�tero: possui os 3 lados iguais.
//	 Tri�ngulo Is�scele: possui 2 lados iguais.
//	 Tri�ngulo Escaleno: possui 3 lados diferentes.
public class Exercicio3 {

	public static void main(String[] args) {
		int lado1 = 95, lado2 = 95, lado3 = 60;
		
		if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("� um tri�ngulo equil�tero.");		
		} else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			System.out.println("� um tri�ngulo is�sceles.");		
		} else {
			System.out.println("� um tri�ngulo escaleno.");		
		}	
	}
}
