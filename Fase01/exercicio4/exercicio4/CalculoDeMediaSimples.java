package exercicio4;

import java.util.Scanner;

public class CalculoDeMediaSimples {

	public static void main(String[] args) {
		/*4. Cálculo de Média Simples
		Faça um programa que solicite ao usuário três notas (valores decimais) e 
		exiba a média aritmética delas.*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a primeira nota:");
		float G1 = sc.nextFloat();
		System.out.print("Digite a segunda nota:");
		float G2 = sc.nextFloat();
		System.out.print("Digite a terceira nota:");
		float G3 = sc.nextFloat();
		double media =(G1 + G2 + G3)/3;
		System.out.printf("A media é %.2f%n", media);

	}

}
