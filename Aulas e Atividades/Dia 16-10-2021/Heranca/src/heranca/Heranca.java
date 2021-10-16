package heranca;

public class Heranca {
	
	public static void main(String[] args) {
		
		//Profissional p1 = new Profissional(); Profissional classe abstrata, não pode swer instanciada
		Professor p2 = new Professor();
		ProfissionalTI p3 = new ProfissionalTI();
		ProfissionalTIGestao p4 = new ProfissionalTIGestao();
		
//		p1.setNome("João");
		p2.setNome("Lurdes");
		p3.setNome("Maria");
		p3.setSalario(5000.0);
		p4.setNome("Andreia");
		p4.setSalario(10000.0);
		
//		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p3.bonusSalario());
		System.out.println(p4.toString());
		System.out.println(p4.bonusSalario());
	}
}
