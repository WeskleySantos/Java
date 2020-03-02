package aula2;

public class Aluno {
	String nome, ra;
	Curso curso;
	
	void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("RA: " + ra);
		System.out.println("Curso: " + curso);
	}
	
	void opniao() {
		switch (curso) {
		case SI:
			System.out.println("CURSO DE DESINGNER");
			break;
		case ADS:
			System.out.print("CURSO DE COBOL");
			break;
		case LOG:
			System.out.print("CURSO DE CAMINHÃO");
			break;
		default:
			System.out.println("NINGUEM LIGA");
			break;
		}
	}
}
