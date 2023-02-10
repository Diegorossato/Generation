package LacoDecisao;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {
		
		Scanner Leia = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.print("\nDigite o valor de A: ");
		A = Leia.nextInt();
		System.out.print("\nDigite o valor de B: ");
		B = Leia.nextInt();
		System.out.print("\nDigite o valor de C: ");
		C = Leia.nextInt();
		
		if (A + B > C) {
			System.out.println("\nA soma de A + B é maior que C!");
		} else if (A + B < C) {
			System.out.println("\nA soma de A + B é menor que C!");
		} else {
			System.out.println("\nA soma de A + B é igual a C!");
		}
	}
}
