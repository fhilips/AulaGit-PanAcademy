package exercicio.resolucaoAlternativa;

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
		Ave galinha = new Galinha();
		Mamifero cachorro = new Cachorro();
		
		ave.comunicar();
		ave.movimentar();
		System.out.println("----------------------------------");
		
		mamifero.comunicar();
		mamifero.movimentar();	
		System.out.println("----------------------------------");
		
		galinha.comunicar();
		galinha.respirar();				
		System.out.println("----------------------------------");
		
		cachorro.comunicar();
		cachorro.respirar();
	}

}
