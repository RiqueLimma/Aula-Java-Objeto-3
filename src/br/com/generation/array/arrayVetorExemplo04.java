package br.com.generation.array;

import java.util.Scanner;

public class arrayVetorExemplo04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); // CTRL + SHIFT + O
		
		double[] notas = new double [4];
		double soma = 0.0, media = 0.0;
		int i;
		
		System.out.println("Professor Digite as quatros notas do Aluno: ");
		
		for(i = 0; i <= 3; i++) {
			notas[i] = entrada.nextDouble();
		}
		
		for(i = 0;i <= 3; i++) {
			soma += notas[i];
			
			media = soma / 4;
		}
		
		System.out.println("A soma das notas: " + soma);
		System.out.println("A média das notas: " + media);

	}

}
