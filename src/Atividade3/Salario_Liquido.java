package Atividade3;

import java.util.Scanner;

public class Salario_Liquido {

	public static void main(String[] args) {
		
		float salario, adicional, horas, desconto, salariol;
		
		Scanner Leia = new Scanner(System.in);
		
		System.out.println("\nDigite o seu Salário: ");
		salario = (float) Leia.nextDouble();
		System.out.println("\nDigite o Adicional Noturno: ");
		adicional = (float) Leia.nextDouble();
		System.out.println("\nDigite as Horas Extras: ");
		horas = (float) Leia.nextDouble();
		System.out.println("\nDigite os Descontos: ");
		desconto = (float) Leia.nextDouble();
		
		salariol = salario+adicional+(horas *5)-desconto;
		
		System.out.println("\nSeu Salário Líquido é: " +salariol);
		
		
		
	}

}
