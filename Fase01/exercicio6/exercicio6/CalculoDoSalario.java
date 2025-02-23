package exercicio6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoDoSalario 
{
	/* 
	  	6. Cálculo do Salário
		Escreva um programa que receba o salário bruto de um funcionário e o valor de desconto do INSS. 
		O programa deve calcular e exibir o salário líquido.
	*/
	
	public static void main(String[] args) 
	{	
		System.out.println("CÁLCULO DO SALÁRIO");
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Escreve seu salário bruto:");
			float salario = sc.nextFloat();
		
		System.out.print("Escreva o valor do desconto do INSS:");
			float desconto = sc.nextFloat();
		
		desconto/=100;
		desconto *= salario;
		salario -= desconto;
		
		System.out.println("O salário líquido é "+ df.format(salario) + "R$");
	}
}
