package LaçoRepetição;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		    Scanner Leia = new Scanner(System.in);
		    int idade, sexo, categoria;
		    char continuar;
		    int countBackend = 0, countFemFrontend = 0, countMascMobileMaior40 = 0, countFemFullStackMenor30 = 0;

		    System.out.println("Digite as informações de cada colaborador: ");
		    do {
		      System.out.print("Idade: ");
		      idade = Leia.nextInt();
		      System.out.print("Sexo (1-Masculino, 2-Feminino, 3-Outros): ");
		      sexo = Leia.nextInt();
		      System.out.print("Categoria (1-Backend, 2-Frontend, 3-Mobile, 4-FullStack): ");
		      categoria = Leia.nextInt();

		      if (categoria == 1) {
		        countBackend++;
		      } else if (categoria == 2 && sexo == 2) {
		        countFemFrontend++;
		      } else if (categoria == 3 && sexo == 1 && idade > 40) {
		        countMascMobileMaior40++;
		      } else if (categoria == 4 && sexo == 2 && idade < 30) {
		        countFemFullStackMenor30++;
		      }

		      System.out.print("Deseja continuar a leitura dos dados de um novo colaborador? (S/N): ");
		      continuar = Leia.next().charAt(0);
		    } while (continuar == 'S' || continuar == 's');

		    System.out.println("\nNúmero de pessoas desenvolvedoras Backend: " + countBackend);
		    System.out.println("Número de mulheres desenvolvedoras Frontend: " + countFemFrontend);
		    System.out.println("Número de homens desenvolvedores Mobile maiores de 40 anos: " + countMascMobileMaior40);
		    System.out.println("Número de mulheres desenvolvedoras FullStack menores de 30 anos: " + countFemFullStackMenor30);
		  }
		}
