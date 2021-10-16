package exercicios;
import java.util.Scanner;

//	Escreva um programa que verifique a validade de uma senha fornecida pelo usuário.
//	A senha válida é o número 1234.	Devem ser	impressas as seguintes	mensagens: 
//		ACESSO	PERMITIDO	caso	a	senha	seja	válida. ACESSO	NEGADO	caso	a	senha	seja	inválida.
public class Exercicio3 {
	public static void main(String[] args) {
		String senhaCorreta = "1234";
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a senha: ");
		String senha = sc.nextLine();

		if (senha.equals(senhaCorreta)) {
			System.out.println("A senha está correta");
		} else {
			System.out.println("A senha está incorreta");
		}

		sc.close();
	}
}
