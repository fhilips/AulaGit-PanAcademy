package exercicios;

//	3. Crie de  uma classe Aluno com os seguintes atributos e m�todos: -String nome,
//	double[] notas,  aprovado(), maiorNota() e media() (al�m dos getters e setters
//	necess�rios).
//	dadas as notas: double[] notas = {10, 5.0, 7.0, 9.0, 10.0};, retorne as seguintes
//	observa��es sobre o aluno: a maior nota, m�dia e caso m�dia maior que 7 =
public class Exercicio3 {

	public static void main(String[] args) {
		double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
		
		Aluno aluno = new Aluno("Jo�o Carlos", notas);
		
		System.out.println("Nome do aluno: " + aluno.getNome());
		System.out.println("Maior nota: " + aluno.maiorNota());
		System.out.println("M�dia do aluno: " + aluno.media());
		System.out.println("O Aluno foi: " + aluno.aprovado());
		
	}	
}
