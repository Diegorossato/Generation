package ExercícioRepetição;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner Leia = new Scanner(System.in);

		int i;

		for (i = 1000; i <= 1999; i++) {
			if (i % 11 == 5) {
				System.out.println(i);
			}

		}

	}

}
