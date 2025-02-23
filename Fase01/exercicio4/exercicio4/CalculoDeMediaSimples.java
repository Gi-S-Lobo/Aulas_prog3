package exercicio4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoDeMediaSimples 
{
	/* 
	 	4. Cálculo de Média Simples
		Faça um programa que solicite ao usuário três notas (valores decimais) e exiba a média aritmética delas.
	*/
	
	public static void main(String[] args) 
	{
		System.out.println("CALCULO MÉDIA SIMPLES");
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Digite a primeira nota:");
			float G1 = sc.nextFloat();
		
		System.out.print("Digite a segunda nota:");
			float G2 = sc.nextFloat();
		
		System.out.print("Digite a terceira nota:");
			float G3 = sc.nextFloat();
		
		double media =(G1 + G2 + G3)/3;
		
		System.out.print("A media é "+ df.format(media));
	}
}
