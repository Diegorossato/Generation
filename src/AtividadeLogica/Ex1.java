package AtividadeLogica;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int anos, meses, dias, idadeEmDias;

		Scanner Leia = new Scanner(System.in);
		
		System.out.println("\nQuantos anos você tem? ");
		anos = (int) Leia.nextInt();
		System.out.println("\nQuantos meses você tem? ");
		meses = (int) Leia.nextInt();
						
		idadeEmDias = anos * 365;
	    System.out.println("\nSua idade em dias é: " + idadeEmDias);

				

	}

}




//Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.