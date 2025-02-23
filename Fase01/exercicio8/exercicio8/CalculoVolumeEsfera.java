package exercicio8;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class CalculoVolumeEsfera 
{
	/*
		 8. Cálculo do Volume de uma Esfera
		Crie um programa que leia o raio de uma esfera e calcule o seu volume.

		Fórmula: V = (4/3) * π * raio³.

		Use π = 3.14159.
	*/
	
	public static void main(String[] args) 
	{
		System.out.println("CÁLCULO DO VOLUME DA ESFERA");
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Digite o raio da esfera:");
			float raio = sc.nextFloat();
		
		double pi =  3.14159; /*	float = (float)		*/
		double cuboraio = Math.pow(raio,3);
		double volume = pi*cuboraio*4/3;
		
		System.out.println("O volume da esfera é "+ df.format(volume));
	}
}
