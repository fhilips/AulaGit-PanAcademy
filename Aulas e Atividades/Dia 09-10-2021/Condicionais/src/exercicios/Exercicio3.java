package exercicios;
import java.util.Scanner;

//	Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio.
//	A senha v�lida � o n�mero 1234.	Devem ser	impressas as seguintes	mensagens: 
//		ACESSO	PERMITIDO	caso	a	senha	seja	v�lida. ACESSO	NEGADO	caso	a	senha	seja	inv�lida.
public class Exercicio3 {
	public static void main(String[] args) {
		String senhaCorreta = "1234";
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a senha: ");
		String senha = sc.nextLine();

		if (senha.equals(senhaCorreta)) {
			System.out.println("A senha est� correta");
		} else {
			System.out.println("A senha est� incorreta");
		}

		sc.close();
	}
}
