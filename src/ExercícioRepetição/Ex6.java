package ExercícioRepetição;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner Leia = new Scanner(System.in);

		int num, sum = 0, count = 0;

		do {
			System.out.print("Informe um número inteiro (0 para sair): ");
			num = Leia.nextInt();
			if (num != 0 && num % 3 == 0) {
				sum += num;
				count++;
			}
		} while (num != 0);

		if (count == 0) {
			System.out.println("Não houve números múltiplos de 3 informados.");
		} else {
			double average = (double) sum / count;
			System.out.println("A média dos números múltiplos de 3 é: " + average);
		}

	}

}
