package Array;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		Scanner Leia = new Scanner(System.in);

		double[][] notas = new double[10][4];

		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Notas do aluno %d: \n", i + 1);
			for (int j = 0; j < 4; j++) {
				System.out.printf("Bimestre %d: ", j + 1);
				notas[i][j] = Leia.nextDouble();
			}
		}


		double[] medias = new double[10];
		for (int i = 0; i < 10; i++) {
			double soma = 0;
			for (int j = 0; j < 4; j++) {
				soma += notas[i][j];
			}
			medias[i] = soma / 4;
		}

		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Média do aluno %d: %.2f\n", i + 1, medias[i]);
		}

	}

}
