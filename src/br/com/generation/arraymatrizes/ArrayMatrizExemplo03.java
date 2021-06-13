package br.com.generation.arraymatrizes;

import java.util.Scanner;

public class ArrayMatrizExemplo03 {

	public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    
    double[][] notasAlunos = new double[2][4];
    
    System.out.println("=== Nostas do Alunos ===");
    
    for(int l = 0;l < notasAlunos.length; l++) {
		
		for(int c = 0;c < notasAlunos[l].length; c++) {
			System.out.printf("DIGITE AS NOTAS: %d %d", l, c);
			
			notasAlunos[l][c] = entrada.nextDouble();

		
				}	
    		}
		}
	}


