package exerciciosCondicionais;

//	1)	Escreva um programa que leia o valor de 3 �ngulos de um tri�ngulo e escreva se o tri�ngulo � Acut�ngulo, Ret�ngulo ou Obtus�ngulo. Sendo que:
//	 Tri�ngulo Ret�ngulo: possui um �ngulo reto. (igual a 90o)
//	 Tri�ngulo Obtus�ngulo: possui um �ngulo obtuso. (maior que90o)
//	 Tri�ngulo Acut�ngulo: possui tr�s �ngulos agudos. (menor que 90o)

public class Exercicio1 {

public static void main(String[] args) {
			
	int angulo1 = 95, angulo2 = 25, angulo3 = 60;
	
	if(angulo1 + angulo2 + angulo3 != 180) {
		System.out.println("N�o � um tri�ngulo");		
	} else if(angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
		System.out.println("� um tri�ngulo ret�ngulo");		
	} else if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
		System.out.println("� um tri�ngulo obtus�ngulo");
	} else {
		System.out.println("� um tri�ngulo acut�ngulo");
	}
}
}