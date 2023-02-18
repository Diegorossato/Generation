package Atividade2;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner Leia = new Scanner(System.in);
		
		System.out.println("\nDigite a primeira nota: ");
		nota1 = Leia.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		nota2 = Leia.nextFloat();
		System.out.println("\nDigite a tericera nota: ");
		nota3 = Leia.nextFloat();
		System.out.println("\nDigite a quarta nota: ");
		nota4 = Leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4) / 4;
			
		System.out.printf("\nSua média final é: %.2f" ,media);
		

	}

}
