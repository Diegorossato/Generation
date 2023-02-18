package Atividade1;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner Leia = new Scanner(System.in);
		
		double salario, abono, novoSalario;
		
		
		System.out.println("\nDigite o seu salário: ");
		salario = Leia.nextDouble();
		System.out.println("\nDigite o valor do abono: ");
		abono = Leia.nextDouble();
		novoSalario = salario+abono;
		System.out.printf("O seu novo salário é %.2f" ,novoSalario);
		
	}

}
