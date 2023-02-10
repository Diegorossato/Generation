package AulaJava;

import java.util.Scanner;

public class OláMundo {

	public static void main(String[] args) {
		
	  String nome="Thiago Ferreira";
	  int idade=31;
	  double altura = 1.70, nota1, nota2, nota3, média;
	  
	  Scanner Leia = new Scanner(System.in);
	  
	  System.out.println("\nSeu nome é: "+nome);
	  System.out.println("\nSua idade é: "+idade);
	  System.out.println("\nSua altura é: "+altura);
	  
	  System.out.println("\nEntre com a primeira nota: ");
	  nota1 = Leia.nextDouble();
	  System.out.println("\nEntre com a segunda nota: ");
	  nota2 = Leia.nextDouble();
	  System.out.println("\nEntre com a terceira nota: ");
	  nota3 = Leia.nextDouble();
	  
	  média = (nota1+nota2+nota3) / 3;
	  
	  System.out.println("\nMédia do aluno "+nome+" foi de: "+média);
	  System.out.printf("\nMédia do aluno %s foi de: %.2f e a nota 1 foi de: %f",nome,média,nota1);
	  
	  
	  
	  
	  
	  

	}

}
