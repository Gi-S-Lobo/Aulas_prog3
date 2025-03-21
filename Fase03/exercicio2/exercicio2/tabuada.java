package exercicio2;

import java.util.Scanner;

public class tabuada {
	
	/*
	 	Exercício 2: Tabuada de um número
		Descrição:
		Escreva um programa que solicite um número ao usuário e exiba a tabuada
		desse número de 1 a 10, utilizando um loop while.
		Requisitos:
		• O programa deve pedir um número inteiro ao usuário.
		• Utilizar um contador para iterar de 1 a 10.
		• Exibir a multiplicação do número pelo contador em cada iteração.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
     
        System.out.print("Digite o número da tabuada:");
        int numero = sc.nextInt();
        
        for(int i = 0; i < 10; i++) {
        	System.out.println(i+1 + "*" + numero + "=" + numero*(i+1));
        }
	}

}
