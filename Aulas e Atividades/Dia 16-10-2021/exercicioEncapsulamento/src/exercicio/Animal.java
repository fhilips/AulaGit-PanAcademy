package exercicio;

public abstract class Animal {
	
	private String especie;
	
		
	public Animal(String especie) {
		super();
		this.especie = especie;
	}
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public abstract void comunicar();
	
	public abstract void movimentar();
	

} 