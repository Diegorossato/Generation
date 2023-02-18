package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atv3 {

	public static void main(String[] args) {

		Scanner Leia = new Scanner(System.in);

		Set<Integer> numero = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.println("\nDigite um numero inteiro: ");
			int num = Leia.nextInt();

			numero.add(num);
		}

		Iterator<Integer> num = numero.iterator();

		while (num.hasNext()) {
			System.out.println(num.next());

		}

	}

}
