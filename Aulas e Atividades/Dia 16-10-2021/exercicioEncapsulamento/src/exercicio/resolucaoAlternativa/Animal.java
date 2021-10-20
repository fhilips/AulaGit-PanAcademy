package exercicio.resolucaoAlternativa;

public interface Animal {
		
	public abstract void comunicar();
	
	public abstract void movimentar();
		
	default void respirar() {
		System.out.println("Respirando..");
	}
	
}  