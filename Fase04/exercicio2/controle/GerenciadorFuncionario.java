package controle;


import dominio.Funcionario;
import java.util.Scanner;

public class GerenciadorFuncionario {
    /*
        Exercício 2: Cálculo de Salário com Bônus
        Descrição:
        Crie um programa que calcule o salário final de um funcionário, considerando um
        bônus de acordo com sua categoria.
        Requisitos:
        1. Criar o pacote dominio contendo a classe Funcionario:
        o Atributos: nome (String), salarioBase (double), categoria (String).
        o Método:
        ▪ calcularSalarioFinal(): adiciona um bônus ao salário base:
        ▪ "A" → +20%
        ▪ "B" → +10%

        ▪ "C" → sem bônus

        2. Criar o pacote controle contendo a classe GerenciadorFuncionario:
        o Permitir que o usuário cadastre um funcionário e consulte seu
        salário final.
        o Utilizar switch-case para aplicar a regra do bônus.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Sistema de Cálculo de Salário ===");
   
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();
        
        System.out.print("Digite a categoria (A, B ou C): ");
        String categoria = scanner.next().toUpperCase();
        
     
        Funcionario funcionario = new Funcionario(nome, salarioBase, categoria);
        
  
        double salarioFinal = funcionario.calcularSalarioFinal();
        System.out.println("\n=== Resumo ===");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário Base: R$" + funcionario.getSalarioBase());
        System.out.println("Categoria: " + funcionario.getCategoria());
        System.out.println("Salário Final: R$" + salarioFinal);
        
        scanner.close();
    }
}