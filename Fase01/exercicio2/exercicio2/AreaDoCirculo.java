package exercicio2;

import java.util.Scanner;
import java.lang.Math;

public class AreaDoCirculo {

	public static void main(String[] args) {
		/* 2. Área de um Círculo
		Desenvolva um programa que leia o raio de um círculo e calcule sua área.

		Fórmula: Área = π * raio²

		Considere π = 3.14159.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a raio:");
		float raio = sc.nextFloat();
		float quadradoraio =  (float) Math.pow(raio, 2);
		float area = (float) (3.14159 * quadradoraio);
		System.out.println("A area do circulo é " + area);

	}

}
