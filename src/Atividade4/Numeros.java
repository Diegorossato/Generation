package Atividade4;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		
		int n1, n2, n3, n4, diferença;
		
		Scanner Leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = (int) Leia.nextDouble();
		System.out.println("\nDigite o segundo número: ");
		n2 = (int) Leia.nextDouble();
		System.out.println("\nDigite o terceiro número: ");
		n3 = (int) Leia.nextDouble();
		System.out.println("\nDigite o quarto número: ");
		n4= (int) Leia.nextDouble();
		
		diferença = (n1*n2) - (n3*n4);
		
		System.out.println("\nA diferença é: "+diferença);
		
		
		
		
		
		
		
		
		

	}

}
