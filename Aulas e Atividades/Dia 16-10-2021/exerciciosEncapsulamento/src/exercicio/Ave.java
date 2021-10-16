package exercicio;

public class Ave extends Animal{

	@Override
	public void comunicar() {
		System.out.println("A ave comunica-se cantando!"); 		
	}

	@Override
	public void movimentar() {
		System.out.println("O passáro movimenta-se voando!");
	}
	
}
