package AtividadeLogica;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		float a,b,c,d,e,f,x,y;
		
		Scanner Leia = new Scanner(System.in);
		
		System.out.print("\nEntre com o valor de A: ");
		a = Leia.nextFloat();
		System.out.print("\nEntre com o valor de B: ");
		b = Leia.nextFloat();
		System.out.print("\nEntre com o valor de C: ");
		c = Leia.nextFloat();
		System.out.print("\nEntre com o valor de D: ");
		d = Leia.nextFloat();
		System.out.print("\nEntre com o valor de E: ");
		e = Leia.nextFloat();
		System.out.print("\nEntre com o valor de F: ");
		f = Leia.nextFloat();
		
		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		
		System.out.println("\nO valor do X foi de: " +x);
		System.out.println("\nO valor de Y foi de: " +y);
	}

}
