package exercicio.resolucaoAlternativa;

public class Mamifero implements Animal{

	@Override
	public void comunicar() {
		System.out.println("O mamífero comunica-se fazendo barulho!"); 		
	}

	@Override
	public void movimentar() {
		System.out.println("O mamífero movimenta-se andando!");
	}

}
