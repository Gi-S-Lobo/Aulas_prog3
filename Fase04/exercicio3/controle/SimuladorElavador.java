package controle;

import java.util.Scanner;
import dominio.Elevador;

public class SimuladorElavador {

		/*
		 	Exercício 3: Simulação de Um Elevador
			Descrição:
			Implemente um programa que simule o funcionamento básico de um elevador,
			permitindo subir, descer e exibir o andar atual.
			Requisitos:
			1. Criar o pacote dominio contendo a classe Elevador:
			o Atributos: andarAtual (int), totalAndares (int).
			o Métodos:
			▪ subir(): aumenta o andar atual, se não for o último.
			▪ descer(): reduz o andar atual, se não for o térreo.
			▪ exibirAndar(): exibe o andar atual.
			
			2. Criar o pacote controle contendo a classe SimuladorElevador:
			o Permitir que o usuário suba e desça os andares de acordo com sua
			escolha.
			o Garantir que o elevador não ultrapasse os limites (térreo e último
			andar).
			o Utilizar um do-while para manter a simulação em execução até o
			usuário escolher sair.
		 */
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite a quantidade de andares:");
			int total = sc.nextInt();
			
			System.out.print("Digite o andar que se encontra:");
			int andar = sc.nextInt();
			
			Elevador elevador = new Elevador(total, andar);
			
			int opcao;
			
			do {
			    System.out.println("\n--- Menu do Elevador ---");
		        System.out.println("1. Subir um andar");
		        System.out.println("2. Descer um andar");
		        System.out.println("3. Exibir andar atual");
		        System.out.println("0. Sair");
		        System.out.print("Escolha uma opção: ");
		        
		        opcao = sc.nextInt();
		        
		        switch (opcao) {
		        
		        case 1:
		        	elevador.subir();
		        	break;
		        case 2:
		        	elevador.descer();
		        	break;
		        case 3:
		        	elevador.exibirAndar();
		        	break;
		        case 0:
		        	System.out.println("Saindo do elevador.");
		        	break;
		        default:
		        	System.out.println("Opção Invalida");
		     
		        }
		        
			}while(opcao != 0);
			
			sc.close();
		}		
	
}

