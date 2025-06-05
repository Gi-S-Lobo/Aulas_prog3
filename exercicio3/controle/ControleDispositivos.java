package controle;

import java.util.Scanner;

import dominio.Smartphone;
import dominio.Televisao;

public class ControleDispositivos {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        DispositivoEletronico smartphone = new Smartphone();
        DispositivoEletronico televisao = new Televisao();
        
        int opcao;
        do {
            System.out.println("\n=== CONTROLE DE DISPOSITIVOS ===");
            System.out.println("1 - Ligar Smartphone");
            System.out.println("2 - Desligar Smartphone");
            System.out.println("3 - Ligar TV");
            System.out.println("4 - Desligar TV");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    smartphone.ligar();
                    break;
                case 2:
                    smartphone.desligar();
                    break;
                case 3:
                    televisao.ligar();
                    break;
                case 4:
                    televisao.desligar();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while(opcao != 0);
        
        scanner.close();
	}

}
