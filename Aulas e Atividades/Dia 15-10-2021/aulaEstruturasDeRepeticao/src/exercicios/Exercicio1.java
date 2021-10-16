package exercicios;


//	1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:  
//	a) m�dia do sal�rio da popula��o;
//	b) m�dia do n�mero de filhos;
//	c) maior sal�rio;
//	d) percentual de pessoas com sal�rio at� R$100,00.

public class Exercicio1 {
	public static void main(String[] args) {
		
		final int qtdPopulacao = 20;
				
		double [] salarios = { 200.0, 300.0, 400.0, 50.0, 320.0, 400.0, 100.0, 1200.0, 1150.0,
								800.0, 740.0, 400.0, 500.0, 320.0, 500.0, 700.0, 40.0, 35.0, 15.0, 500.0 };
		int [] quantidadeFilhos = { 1, 2, 4, 5, 6, 4, 2, 9, 6, 1, 2, 2, 5, 6, 3, 5, 5, 1, 5, 6 };
		
		double totalSalario = 0.0;
	  	int totalFilhos = 0;
	  	double maiorSalario = 0.0;
	  	int salariosAteCem = 0;	  		 
		
		for(int i = 0; i < qtdPopulacao; i++) {
			totalSalario += salarios[i];
			totalFilhos += quantidadeFilhos[i];
			
			if(salarios[i] > maiorSalario) {
				maiorSalario = salarios[i];
			}
			
			if(salarios[i] <= 100){
				salariosAteCem++;
			}
		}	
//		Solu��o com for each
		
//		int aux = 0;
//		for(double salario : salarios)
//		{
//			totalSalario += salario;
//			totalFilhos += quantidadeFilhos[aux];
//			aux++;
//			
//			if(salario > maiorSalario ) {
//				maiorSalario = salario;
//			}
//			
//			if(salario <= 100){
//				salariosAteCem++;
//			}
//		}
		
		System.out.printf("M�dia de sal�rio da popula��o: R$%.2f\n", totalSalario / qtdPopulacao );
		System.out.printf("M�dia do n�mero de filhos da popula��o: %s\n", totalFilhos / qtdPopulacao);
		System.out.printf("Maior sal�rio: %.2f\n", maiorSalario);
		System.out.printf("Percentual de pessoas com sal�rio de at� R$100,00: %.2f%%", 
						(salariosAteCem * 100.0) / qtdPopulacao);
	}
}
