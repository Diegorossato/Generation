package ExercícioRepetição;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner Leia = new Scanner(System.in);
		
		int idade, genero, comportamento;
		int calmo = 0, mulherNervosa = 0, homemAgressivo = 0, outroCalmo = 0;
		int nervoso40 = 0, calmoMenor18 = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("\nInforme sua idade: ");
			idade = Leia.nextInt();
			
			System.out.println("\nInforme sua identificação de gênero (1-Feminino / 2-Masculino / 3-Outros): ");
			genero = Leia.nextInt();
			
			System.out.println("\nInforme o seu comportamento (1-Calmo / 2-Nervoso / 3-Agressivo): ");
			comportamento = Leia.nextInt();
			
			if (comportamento == 1) {
				calmo++;
				if (genero == 3) {
					outroCalmo++;
				}
				if (idade < 18) {
					calmoMenor18++;
				}
			}
			else if (comportamento == 2) {
				if (genero == 1) {
					mulherNervosa++;
				}
				if (idade > 40) {
					nervoso40++;
				}
			}
			else if (comportamento == 3) {
				if (genero == 2) {
					homemAgressivo++;
				}
			}
		}
		
		System.out.println("\nNúmero de pessoas calmas: " + calmo);
		System.out.println("\nNúmero de mulheres nervosas: " + mulherNervosa);
		System.out.println("\nNúmero de homens agressivos: " + homemAgressivo);
		System.out.println("\nNúmero de outros calmos: " + outroCalmo);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: " + nervoso40);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: " + calmoMenor18);

	}

}
