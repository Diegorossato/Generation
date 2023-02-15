package Array;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner Leia = new Scanner(System.in);

		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numeroPesquisado, posicaoEncontrada;

		System.out.println("Digite um número para pesquisar no vetor: ");
		numeroPesquisado = Leia.nextInt();

		posicaoEncontrada = -1;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroPesquisado) {
				posicaoEncontrada = i;
				break;
			}

		}

		if (posicaoEncontrada == -1) {
			System.out.println("\nNão foi encontrado!");
		} else {
			System.out.println("O número encontrado na posição " + posicaoEncontrada);
		}

	}

}
