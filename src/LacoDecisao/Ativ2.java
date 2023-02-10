package LacoDecisao;

import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		
		Scanner Leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		int num = Leia.nextInt();
				
		if (num % 2 == 0) {
			System.out.println("O número " + num + "é par");
		}else {
			System.out.println("O número " + num + "é ímpar");
		}
		
		if (num > 0) {
			System.out.println(" e positivo.");
		}else if (num < 0) {
			System.out.println(" e negativo.");
		}else {
			System.out.println("e é zero");
		}
		
	}

}
