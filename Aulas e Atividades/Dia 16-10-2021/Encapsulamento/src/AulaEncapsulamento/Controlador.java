package AulaEncapsulamento;

public abstract interface Controlador { //modificador "abstract" para evidenciar que uma classe servirá APENAS de modelo para as outras
	
	public abstract void ligar(); // não necessariamente precisa de void
	public abstract void desligar();  // O
	public abstract void acelerar();
	public abstract void frear(int velocidade);

}
