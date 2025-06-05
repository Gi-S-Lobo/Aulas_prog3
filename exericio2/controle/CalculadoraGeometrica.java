package controle;

import java.util.Scanner;

import dominio.Circulo;
import dominio.Retangulo;

public class CalculadoraGeometrica {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA GEOMÉTRICA ===");
       
        System.out.println("\nDados do Retângulo:");
        System.out.print("Digite a largura: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
       
        System.out.println("\nDados do Círculo:");
        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();
        
        FormaGeometrica retangulo = new Retangulo(largura, altura);
        FormaGeometrica circulo = new Circulo(raio);
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.printf("Retângulo (%.2f x %.2f):\n", largura, altura);
        System.out.printf("Área: %.2f\n", retangulo.calcularArea());
        System.out.printf("Perímetro: %.2f\n", retangulo.calcularPerimetro());
        
        System.out.printf("\nCírculo (raio %.2f):\n", raio);
        System.out.printf("Área: %.2f\n", circulo.calcularArea());
        System.out.printf("Perímetro: %.2f\n", circulo.calcularPerimetro());
        
        scanner.close();
	}

}
