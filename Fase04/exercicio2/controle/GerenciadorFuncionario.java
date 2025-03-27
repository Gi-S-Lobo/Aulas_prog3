package controle;


import dominio.Funcionario;
import java.util.Scanner;

public class GerenciadorFuncionario {
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