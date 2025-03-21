package exercicio1;

public class SomaDosNaturais {
	
	/*
		Exercício 1: Soma dos N primeiros números naturais
		Descrição:
		Crie um programa que solicite ao usuário um número N e utilize um loop for
		para calcular a soma dos primeiros N números naturais.
		Requisitos:
		• O programa deve utilizar um contador para iterar de 1 até N.
		• Deve utilizar um acumulador para somar os valores sucessivos.
		• Ao final, exibir a soma total.
	*/

	public static void main(String[] args) {
		
		int n = 10;
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println("A soma dos " + n + " primeiros números naturais é " + soma);

	}

}
