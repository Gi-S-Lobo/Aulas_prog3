package controle;

import java.util.Scanner;
import dominio.CaixaEletronico;


public class SimuladorCaixa {
	
	/*
	 	Exercício 5: Simulação de Um Caixa Eletrônico
		Descrição:
		Crie um programa que simule um caixa eletrônico, permitindo saques apenas em
		múltiplos de R$ 10 e garantindo que o saldo seja suficiente.
		Requisitos:
		1. Criar o pacote dominio contendo a classe CaixaEletronico:
		o Atributos: saldo (double).
		o Métodos:
		▪ sacar(double valor): verifica se o valor é múltiplo de 10 e se
		há saldo suficiente.
		▪ exibirSaldo(): exibe o saldo restante.
		2. Criar o pacote controle contendo a classe SimuladorCaixa:
		o Permitir que o usuário realize múltiplos saques, verificando a
		validade do valor.
		o Utilizar um while para continuar as operações até o usuário decidir
		sair.
	 */

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o saldo inicial do caixa: R$ ");
        double saldoInicial = sc.nextDouble();
        
        CaixaEletronico caixa = new CaixaEletronico(saldoInicial);
        int opcao;
        
        do {
            System.out.println("\n    CAIXA ELETRÔNICO    ");
            System.out.println("1 - Realizar saque");
            System.out.println("2 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do saque (múltiplo de 10): R$ ");
                    double valorSaque = sc.nextDouble();
                    caixa.sacar(valorSaque);
                    break;
                    
                case 2:
                    caixa.exibirSaldo();
                    break;
                    
                case 0:
                    System.out.println("Obrigado por utilizar nosso caixa eletrônico!");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao != 0);
        
        sc.close();
	}

}
