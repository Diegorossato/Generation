package AtividadeLogica;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		int idadeDias, anos, meses, dias;
		
		Scanner Leia = new Scanner(System.in);
		
		System.out.println("\nInsira a idade em dias: ");
		idadeDias = Leia.nextInt();
		
		anos = idadeDias / 365;
		meses = (idadeDias % 365) /30;
		dias = (idadeDias % 365) %30;
		
		System.out.println("\nIdade: " +anos + " anos, " +meses + " meses e " +dias + " dias ");
		
	}

}
