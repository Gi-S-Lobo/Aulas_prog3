package dominio;

public class Aluno {
	
	private String nome;
	private double nota;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public boolean validarNota() {
		
		return nota >= 0 && nota <= 10;
	}
	public void classificarAluno() {
		
		if( nota >= 7 ) {
			System.out.println("Aprovado");
		}else if( nota >= 5 && nota < 7) {
		    System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
	}
}
