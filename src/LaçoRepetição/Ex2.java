package LaçoRepetição;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
				
		    Scanner Leia = new Scanner(System.in);
		    
		    int num, contadorPar = 0, contadorImpar = 0;
		    
		    for (int i = 1; i <= 10; i++) {
		      System.out.print("Digite um número inteiro: ");
		      num = Leia.nextInt();
		      
		      if (num % 2 == 0) {
		        contadorPar++;
		      } else {
		        contadorImpar++;
		      }
		    }
		    
		    System.out.println("Números pares: " + contadorPar);
		    System.out.println("Números ímpares: " + contadorImpar);
		    
		    Leia.close();
		  }
		}

