package LaçoRepetição;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		    Scanner Leia = new Scanner(System.in);
		    int num, sum = 0;

		    do {
		      System.out.print("Digite um número inteiro: ");
		      num = Leia.nextInt();
		      if (num > 0) {
		        sum += num;
		      }
		    } while (num != 0);

		    System.out.println("A soma dos números positivos é: " + sum);
		  }
		}
