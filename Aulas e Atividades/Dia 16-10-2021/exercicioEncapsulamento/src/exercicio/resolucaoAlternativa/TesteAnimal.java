package exercicio.resolucaoAlternativa;

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
