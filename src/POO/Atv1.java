package POO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Atv1 {

	public static void main(String[] args) {

		Scanner Leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.println("\nDigite uma cor: ");
			String cor = Leia.next();

			System.out.println("\nA cor " + cor + " foi adicionada!");

			cores.add(cor);
			cores.sort(null);
		}

		Iterator<String> cor1 = cores.iterator();

		while (cor1.hasNext()) {
			System.out.println(cor1.next());

		}
	}

}
