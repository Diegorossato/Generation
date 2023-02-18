package Array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atv4 {

	public static void main(String[] args) {
		
		Scanner Leia = new Scanner(System.in);
		
		Set<Integer> numero = new HashSet<Integer>();
		
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
		
		for (int i = 0; i < 10; i++) {
		System.out.println("Digite um número: ");
		int ne = Leia.nextInt();
				
				
		if (ne != -1) {
			System.out.println(ne);
		} else {
			System.out.println("O número " + ne + "não foi encontrado");
		}
	}
	}

}
