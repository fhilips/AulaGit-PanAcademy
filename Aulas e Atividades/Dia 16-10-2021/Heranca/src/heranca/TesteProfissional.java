package heranca;

public class TesteProfissional {
	
	
	public static void main(String[] args) {
		Professor p1 = new Professor();
		p1.setMateria("POO");
		p1.setSalario(1000);
		p1.setNome("Jenifer");
		p1.bonusSalario();
		
//		System.out.println(p1.toString());
//		System.out.println(p1.bonusSalario());
//		
//		System.out.println("PTG:   ");
//		ProfissionalTIGestao ptg = new ProfissionalTIGestao();
//		ptg.setSalario(1000);
//		System.out.println(ptg.bonusSalario());
		
		System.out.println(p1);
		
		
		
	}
	
	

}
