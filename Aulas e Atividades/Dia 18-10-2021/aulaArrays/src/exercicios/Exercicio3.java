package exercicios;

//	3. Crie de  uma classe Aluno com os seguintes atributos e métodos: -String nome,
//	double[] notas,  aprovado(), maiorNota() e media() (além dos getters e setters
//	necessários).
//	dadas as notas: double[] notas = {10, 5.0, 7.0, 9.0, 10.0};, retorne as seguintes
//	observações sobre o aluno: a maior nota, média e caso média maior que 7 =
public class Exercicio3 {

	public static void main(String[] args) {
		double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
		
		Aluno aluno = new Aluno("João Carlos", notas);
		
		System.out.println("Nome do aluno: " + aluno.getNome());
		System.out.println("Maior nota: " + aluno.maiorNota());
		System.out.println("Média do aluno: " + aluno.media());
		System.out.println("O Aluno foi: " + aluno.aprovado());
		
	}	
}
