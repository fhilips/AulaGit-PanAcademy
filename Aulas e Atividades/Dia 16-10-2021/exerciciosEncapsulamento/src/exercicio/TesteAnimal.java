package exercicio;

//	Exercício: 
//	 Crie uma estrutura de herança para demonstrar o polimorfismo utilizando 
//	classes de animais
//	 Crie o método comunicar() e movimentar() na classe Animal
//	 Nas classes descendentes de animais, sobrescreva os métodos citados de 
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
