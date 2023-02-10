package AtividadeLogica;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, dist;
		
		Scanner Leia = new Scanner(System.in);
		
	    System.out.println("Digite as coordenadas do primeiro ponto (x1,y1): ");
	    x1 = Leia.nextDouble();
	    y1 = Leia.nextDouble();
	    System.out.println("Digite as coordenadas do segundo ponto (x2,y2): ");
	    x2 = Leia.nextDouble();
	    y2 = Leia.nextDouble();
	    
	    dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 
	    
	    System.out.println("A distância entre os pontos é: " + dist);
	    
	  }
	}