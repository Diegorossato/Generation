package ExercícioRepetição;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner Leia = new Scanner(System.in);
		
		int num, par = 0, impar = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("\nDigite um número: ");
			num = Leia.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Foram digitados " + par + " números pares e " + impar + " números ímpares.");
		
	}

}
