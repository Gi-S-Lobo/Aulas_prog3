package exercicio10;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class DistanciaDosPontos 
{
	
	/*
	 	10. Distância Entre Dois Pontos
	 	Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois pontos no plano cartesiano.
	 	Calcule a distância entre eles.

		Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²)
	*/
	
	public static void main(String[] args) 
	{
		
		System.out.println("DISTÀNCIA ENTRE DOIS PONTOS");
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.print("Me dê as coordenadas x1 e y1:");
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			
		System.out.print("Me dê as coordenadas x2 e y2:");
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			
		double subDex = x2 - x1;
		double subDey = y2 - y1;
		
		double quadradoX = Math.pow(subDex, 2);
		double quadradoY = Math.pow(subDey, 2);
		
		double somaDosQuadrados = quadradoX + quadradoY;
		
		double distancia = Math.sqrt(somaDosQuadrados);
	
		System.out.println("A distancia dos dois pontos é "+ df.format(distancia));
	}
}
