package LaçoRepetição;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		        Scanner Leia = new Scanner(System.in);
		        int idade;
		        int menorQue21 = 0;
		        int maiorQue50 = 0;

		        System.out.print("Digite a idade da pessoa: ");
		        idade = Leia.nextInt();
		        
		        while (idade >= 0) {
		            if (idade < 21) {
		                menorQue21++;
		            } else if (idade > 50) {
		                maiorQue50++;
		            }
		            
		            System.out.print("Digite a idade da pessoa: ");
		            idade = Leia.nextInt();
		        }
		        
		        System.out.println("Total de pessoas com idade menor que 21: " + menorQue21);
		        System.out.println("Total de pessoas com idade maior que 50: " + maiorQue50);
		    }
		}
