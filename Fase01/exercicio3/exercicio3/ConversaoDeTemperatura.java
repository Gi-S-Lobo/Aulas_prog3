package exercicio3;

import java.util.Scanner;

public class ConversaoDeTemperatura {

	public static void main(String[] args) {
		/*3. Conversão de Temperatura
		Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.

		Fórmula: F = (C × 9/5) + 32.*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a temperatura:");
		float celsius = sc.nextFloat();
		float fahrenheit = (celsius*(9/5)) + 32;
		System.out.println("A temperatura em Fahrenheit é" + fahrenheit);
		
		

	}

}
