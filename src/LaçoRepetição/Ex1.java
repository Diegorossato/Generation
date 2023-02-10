package LaçoRepetição;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		    Scanner Leia = new Scanner(System.in);
		    
		    int num1, num2;
		    
		    System.out.println("Digite o primeiro número inteiro: ");
		    num1 = Leia.nextInt();
		    
		    System.out.println("Digite o segundo número inteiro: ");
		    num2 = Leia.nextInt();
		    
		    if (num1 >= num2) {
		      System.out.println("Intervalo inválido.");
		      return;
		    }
		    
		    System.out.println("Números múltiplos de 3 e 5 no intervalo [" + num1 + "," + num2 + "]:");
		    
		    for (int i = num1; i <= num2; i++) {
		      if (i % 3 == 0 && i % 5 == 0) {
		        System.out.println(i);
		      }
		    }
		  }
		}
