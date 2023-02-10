package LaçoRepetição;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		    Scanner scan = new Scanner(System.in);
		    int num, count = 0, sum = 0;
		    double average;
		    
		    do {
		      System.out.print("Digite um número inteiro: ");
		      num = scan.nextInt();
		      
		      if (num != 0 && num % 3 == 0) {
		        count++;
		        sum += num;
		      }
		    } while (num != 0);
		    
		    if (count > 0) {
		      average = (double) sum / count;
		      System.out.println("A média dos números múltiplos de 3 é: " + average);
		    } else {
		      System.out.println("Não foram digitados números múltiplos de 3.");
		    }
		  }
		}

