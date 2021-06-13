package br.com.generation.array;

public class ArrayVetorExemplo03 {

	public static void main(String[] args) {
		/*
		double tempDias001 = 31.3;
		double tempDia002 = 32;
		*/
		double[] temperaturas = new double[31];
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 28;
		temperaturas[4] = 22;
		
		System.out.println("O valor da Temperatura do dia 03: " + temperaturas[4]);
		
		System.out.println(("O tamanho do Array é: " + temperaturas.length));
		
		System.out.println("Valores do meu Array: ");
		
		for(int i = 0;i < temperaturas.length;i ++) {
			System.out.println("O valor da temperatura do dia " + i 
					+ (i + 1) + "° é: " + temperaturas[2]);
		}
	}

}
