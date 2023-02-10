package AtividadeLogica;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, peso1, peso2, peso3, mediaPonderada;
		
		Scanner Leia = new Scanner(System.in);
		
		System.out.print("\nDigite a primera nota: ");
		nota1 = Leia.nextDouble();
		
		System.out.print("\nDigite a segunda nota: ");
		nota2 = Leia.nextDouble();
		
		System.out.print("\nDigite a terceira nota: ");
		nota3 = Leia.nextDouble();
		
		peso1 = 2.0;
		peso2 = 3.0;
		peso3 = 5.0;
		
		mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
		
		System.out.print("\nA média ponderada do aluno é: " + mediaPonderada);
		

	}

}
