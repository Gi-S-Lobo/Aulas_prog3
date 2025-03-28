package controle;

import java.util.Scanner;
import dominio.Aluno;

public class GerenciadorAluno {
	
	/*
	 	Exercício 4: Validação de Nota de um Aluno
		Descrição:
		Crie um programa que leia uma nota de um aluno e verifique sua validade. Se for
		válida, classifique o aluno conforme sua média.
		Requisitos:
		1. Criar o pacote dominio contendo a classe Aluno:
		
		o Atributos: nome (String), nota (double).
		o Métodos:
		▪ validarNota(): verifica se a nota está entre 0 e 10.
		▪ classificarAluno(): classifica o aluno:
		▪ Nota >= 7 → "Aprovado"
		▪ Nota >= 5 e < 7 → "Recuperação"
		▪ Nota < 5 → "Reprovado"
		
		2. Criar o pacote controle contendo a classe GerenciadorAluno:
		o Solicitar o nome e a nota do aluno e verificar sua validade antes de
		exibir a classificação.
		o Utilizar um while para garantir que o usuário informe uma nota
		válida.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno(a):");
		String nome = sc.nextLine();
        
       
        double nota;
        Aluno aluno;
        
        while(true) {
        	
        		System.out.print("Digite a nota do aluno(a) (0-10): ");
                nota = sc.nextDouble();	
                
               aluno = new Aluno(nome, nota);
          
               if(aluno.validarNota() == true) {
            	   break;
               }else {
            	   System.out.println("Nota Inválida!");
               }       
		}
			
        aluno.classificarAluno();
        sc.close();
	}
}



