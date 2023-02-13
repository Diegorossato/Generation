package ExercícioRepetição;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner Leia = new Scanner(System.in);
		
		int idade = 0, menorQue21 = 0, maiorQue50 = 0;
		
		while (idade != -99) {
			System.out.println("\nDigite a idade: ");
			idade = Leia.nextInt();
			if (idade < 21 && idade != -99) {
				menorQue21++;
			}
			if (idade > 50 && idade != -99) {
				maiorQue50++;
			}
		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos: " + menorQue21);
		System.out.println("\nTotal de pessoas com mais de 50 anos: " + maiorQue50);

	}

}
