package Atividade1;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		float salario, abono, nsalario;
		
		Scanner Leia = new Scanner(System.in);
		
		System.out.println("\nDigite o seu salário: ");
		salario = (float) Leia.nextDouble();
		System.out.println("\nDigite o valor do abono: ");
		abono = (float) Leia.nextDouble();
		nsalario = salario+abono;
		System.out.printf("O seu novo salário é %2f" ,nsalario);
		
	}

}
