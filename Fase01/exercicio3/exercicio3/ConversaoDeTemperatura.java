package exercicio3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ConversaoDeTemperatura 
{
	/* 
	 	3. Conversão de Temperatura
		Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.

		Fórmula: F = (C × 9/5) + 32.
	*/
	
	public static void main(String[] args) 
	{	
		System.out.println("CONVERSÃO DE TEMPERATURA");
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Digite a temperatura:");
			float celsius = sc.nextFloat();
		
		float fahrenheit = (celsius*(9/5)) + 32;
		
		System.out.println("A temperatura em Fahrenheit é " + df.format(fahrenheit));
	}
}
