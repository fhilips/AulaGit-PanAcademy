package AulaEncapsulamento;

public class TesteCarro {
	public static void main(String[] args) {
		Carro c = new Carro();
		
		c.ligar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.frear(c.getVelocidade());
		
//		c.velocidade = 100;
//		c.setVelocidade(100);
		
		System.out.println("Velocidade atual: " + c.getVelocidade() + "km/h");
	}

}
