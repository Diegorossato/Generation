package AtividadeLogica;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int a, b, c, r, s, d;
		
		Scanner Leia = new Scanner(System.in);
		
		System.out.print("Insira o valor de A: ");
	    a = Leia.nextInt();

	    System.out.print("Insira o valor de B: ");
	    b = Leia.nextInt();

	    System.out.print("Insira o valor de C: ");
	    c = Leia.nextInt();

	    r = (int) Math.pow((a + b), 2);
	    s = (int) Math.pow((b + c), 2);
	    d = (r + s) / 2;

	    System.out.print("O resultado de D é: " + d);
	  }
	
	
}
