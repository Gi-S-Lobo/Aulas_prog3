
package controle;

import java.util.Scanner;

import dominio.ContaBancaria;

public class ControleDeContaBancaria {
	/*
	 	Exercício 1: Controle de Conta Bancária
		Descrição:
		Crie um programa que simule uma conta bancária, permitindo depósitos e
		saques.
		Requisitos:
		1. Criar o pacote dominio contendo a classe ContaBancaria:
		o Atributos: titular (String), saldo (double).
		o Métodos:
		▪ depositar(double valor): adiciona um valor ao saldo.
		▪ sacar(double valor): subtrai um valor do saldo, se houver
		saldo suficiente.
		▪ exibirSaldo(): exibe o saldo atual.
		
		2. Criar o pacote controle contendo a classe GerenciadorConta:
		o Permitir que o usuário cadastre uma conta e realize operações
		(depositar, sacar, consultar saldo).
		o Utilizar um while para continuar as operações até o usuário escolher
		sair.
	*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = null;

        System.out.println("=== Sistema Bancário ===");
        
        // Cadastro da conta
        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();
        conta = new ContaBancaria(titular);
        System.out.println("Conta criada com sucesso para " + titular + "!");

        int opcao;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                    
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                    
                case 3:
                    conta.exibirSaldo();
                    break;
                    
                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
        } while (opcao != 4);
        
        scanner.close();
		

	}

}
