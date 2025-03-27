package exercicio4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MediaNotas {

	/*
		Exercício 4: Média de notas de uma turma
	
		Descrição:
		Desenvolva um programa que calcule a média das notas de uma turma, onde
		o usuário informe quantos alunos há na turma e suas respectivas notas.
		Requisitos:
		• O programa deve solicitar a quantidade de alunos.
		• Deve utilizar um loop for para receber as notas de cada aluno.
		• Utilizar um acumulador para somar todas as notas.
		• No final, exibir a média da turma.
	 */
	public static void main(String[] args) {
		
		System.out.println("MEDIA DAS NOTAS");
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Qual é a quantidade de alunos?");
		int qtde = sc.nextInt();
		
		double soma = 0.0;
		
		for(int i = 0; i < qtde; i++) {
			
			System.out.print("Digite um número:");
			double nota = sc.nextDouble();
			
			soma+=nota;
		}
		
		double media = 0.0;
		
		media = soma/qtde;
		
		System.out.println("A média das notas é" + df.format(media));
		
	}

}
