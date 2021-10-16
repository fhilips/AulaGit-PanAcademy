package exercicio;

//	Exerc�cio: 
//	 Crie uma estrutura de heran�a para demonstrar o polimorfismo utilizando 
//	classes de animais
//	 Crie o m�todo comunicar() e movimentar() na classe Animal
//	 Nas classes descendentes de animais, sobrescreva os m�todos citados de 
//	acordo com os tipos de animais

public class TesteAnimal {

	public static void main(String[] args) {
		Animal ave = new Ave();
		Animal mamifero = new Mamifero();
		
		ave.comunicar();
		ave.movimentar();
		mamifero.comunicar();
		mamifero.movimentar();		
	}

}
