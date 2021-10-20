package exercicios;

public class Aluno {
	
	private String nome;
	double[] notas;
		
	public Aluno(String nome, double[] notas) {		
		this.nome = nome;
		this.notas = notas;
	}

	public double media() {
		double total = 0;
		for (double nota : this.notas) {
			total += nota;		
		}
		
		return total / this.notas.length;
	}

	public String aprovado() {
		if(media() > 7) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}
	
	public double maiorNota() {
		double maiorNota = this.notas[0];
		for (double nota: this.notas) {
			if(nota > maiorNota) {
				maiorNota = nota;
			}
		}
		return maiorNota;
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}		
	
}
