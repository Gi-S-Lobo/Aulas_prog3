package exercicio1;

import java.util.Scanner;

public class SomaDeDoisNumeros {
	/*1. Soma de Dois Números
	Escreva um programa que solicite ao usuário dois números inteiros e exiba a soma deles.*/
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número:");
		float numero1 = sc.nextFloat();
		System.out.print("Digite o outro número:");
		float numero2 = sc.nextFloat();
		float soma = numero1 + numero2;
		System.out.println("A soma dos dois números é " + soma);
	}
}
