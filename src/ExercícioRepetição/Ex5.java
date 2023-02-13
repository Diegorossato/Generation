package ExercícioRepetição;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
	
		Scanner Leia = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("\nDigite um número: ");
			numero = Leia.nextInt();
			soma += numero;			
		} while (numero != 0);
		
		System.out.println("\nA soma dos números digitados é: " + soma);

	}

}
