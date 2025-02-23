package exercicio5;

import java.util.Scanner;

public class ConversaoDeIdade 
{
	/* 
	 	5. Conversão de Idade para Dias
		Desenvolva um programa que leia a idade de uma pessoa em anos e 
		exiba a quantidade aproximada de dias que ela já viveu.

		Considere um ano com 365 dias.
	*/
	
	public static void main(String[] args) 
	{	
		System.out.println("CONVERSÃO DE IDADE");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade:");
			int idade = sc.nextInt();
		
		idade *= 365;
		
		System.out.println("A sua idade em dias é: " + idade);
	}
}
