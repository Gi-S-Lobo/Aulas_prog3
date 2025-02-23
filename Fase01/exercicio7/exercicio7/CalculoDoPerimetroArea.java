package exercicio7;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoDoPerimetroArea 
{
	/* 
	 	7. Cálculo do Perímetro e Área de um Retângulo
		Faça um programa que solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.

		Fórmulas:

		Área = base × altura

		Perímetro = 2 × (base + altura).
	*/
	
	public static void main(String[] args) 
	{	
		System.out.println("CÁLCULO DO PERÍMETRO DA ÁREA");
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df  = new DecimalFormat("#.00");
		
		System.out.print("Digite a base do tringulo:");
			float base = sc.nextFloat();
		
		System.out.print("Digite a altura do tringulo:");
			float altura = sc.nextFloat();
		
		float area = base * altura;
		float perimetro = 2 * (base + altura);
		
		System.out.println("A area do triangulo é "+ df.format(area) + "\nO perimetro do triangulo é " + df.format(perimetro));
	}
}
