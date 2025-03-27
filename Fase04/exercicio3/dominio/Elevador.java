package dominio;

public class Elevador {
	
	private int andarAtual;
	private int totalAndares; 
	
	public Elevador(int totalAndares, int andarAtual) {
		this.andarAtual = andarAtual;
	    this.totalAndares = totalAndares;
	}
	
	public void subir() {
		
		if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subindo para o andar " + andarAtual);
        } else {
            System.out.println("Já estamos no último andar!");
        }
		
	}
	
	public void descer() {
		
		if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Descendo para o andar " + andarAtual);
        } else {
            System.out.println("Já estamos no térreo!");
        }
	}
	
	public void exibirAndar() {
		
		 System.out.println("Andar atual: " + andarAtual);
	}
	
	
	public int getAndarAtual() {
		return andarAtual;
	}
	
	public int gettotalAndares() {
		return totalAndares;
	}
	

}
