package LacoDecisao;

/*
 * Operador Lógico E
 * 
 * Entrada1 	Entrada2	Saída
 * V			V			V
 * V			F			F
 * F			V			F		
 * F			F			F
 * 
 *  Operador Lógico OU
 * 
 * Entrada1 	Entrada2	Saída
 * V			V			V
 * V			F			V
 * F			V			V		
 * F			F			F
 */

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		double n1, n2, n3, media;
		int op;
		
		Scanner Leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		n1 = Leia.nextDouble();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = Leia.nextDouble();
		System.out.println("\nEntre com a terceira nota: ");
		n3= Leia.nextDouble();
		
		media = (n1 + n2 + n3) / 3;
		System.out.printf("\nMédia: %.2f", media);
		
		if(media>=7 && media<=10) {
			System.out.println("\nParabéns, você foi APROVADO!");
		}
		else if(media>=5 && media<7) {
			System.out.println("\nAtenção, você está de EXAME!");
		}
		else if(media>=0 && media<5) {
			System.out.println("\nInfelizmente você foi REPROVADO!");
		}
		else {
			System.out.println("\nPor favor, veririque as notas ");
		}
		
		System.out.println("\n\t\tMenu de elogios");
		System.out.println("\nEscolha um elogio para a Família 60");
		System.out.println("\n1- Sensacioal");
		System.out.println("\n2- Incrível");
		System.out.println("\n3- Maravilhosa");
		System.out.println("\n4- Legal");
		System.out.println("\nDigite sua opção: ");
		op = Leia.nextInt();
		
		switch (op) {
		case 1: 
			System.out.println("\nSensacioal");
		break;
		case 2:
			System.out.println("\nIncrível");
		break;
		case 3: System.out.println("\nMaravilhosa");
		break;
		case 4: System.out.println("\nLegal");
		break;
		default:
			System.out.println("\nOpção Inválida! ");
		}
				
		
		
	}

}
