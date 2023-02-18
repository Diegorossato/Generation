package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv2 {

	public static void main(String[] args) {

		Scanner Leia = new Scanner(System.in);

		ArrayList<Integer> numero = new ArrayList<Integer>();

		numero.add(2);
		numero.add(5);
		numero.add(1);
		numero.add(3);
		numero.add(4);
		numero.add(9);
		numero.add(7);
		numero.add(8);
		numero.add(10);
		numero.add(6);

		System.out.println("Digite um número: ");
		int ne = Leia.nextInt();
		int pos = numero.indexOf(ne);

		if (pos != -1) {
			System.out.println("\nO número " + ne + " está localizado na posição: " + pos);
		} else {
			System.out.println("O número " + ne + " não foi encontrado!");
		}

	}

}
