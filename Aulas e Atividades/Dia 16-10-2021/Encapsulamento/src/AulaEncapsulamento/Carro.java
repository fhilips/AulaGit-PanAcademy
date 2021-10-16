package AulaEncapsulamento;

public class Carro implements Controlador {
	private String cor; // atributos da classe
	private int velocidade;
	private boolean ligado;
	
	
	public Carro() { // metodo Contruct // construtor do objeto
		this.cor = "prata";
		this.velocidade = 0;
		this.ligado = false;
	}


	public String getCor() { // Método Acessor Getter
		return cor;
	}


	public void setCor(String cor) { // Método Modificador Setter
		this.cor = cor;
	}


	public int getVelocidade() {
		return velocidade;
	}


	private void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}


	public boolean getLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	@Override //sobrescrever Metodos obrigatorios gerados a partir da interface
	public void ligar() {
		this.setLigado(true);
		System.out.println("Carro ligou"); // ex. de implementação do metodo
	}


	@Override
	public void desligar() {
		this.setLigado(false);
	}


	@Override
	public void acelerar() {
		if(this.getLigado()) {
			this.setVelocidade(this.getVelocidade()+5);
		}
		System.out.println("Acelerou + 5 km/h");
	}


	@Override
	public void frear(int velocidade) { // ex de Metodo com argumento 
		
		if(this.getLigado() && velocidade >= 5) {
			this.setVelocidade(this.getVelocidade()-5);
		}
		
		System.out.println("Reduziu em 5km/h a velocidade");
	}
	
		
}
