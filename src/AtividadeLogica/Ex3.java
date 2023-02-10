package AtividadeLogica;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int segundos, horas, minutos, restoSegundos;
		
		Scanner Leia = new Scanner(System.in);
		
		System.out.println("\nInsira a duração do evento em segundos: ");
		segundos = (int) Leia.nextInt();
		
		horas = segundos /3600;
		minutos = (segundos % 3600) / 60;
		restoSegundos = (segundos % 3600) % 60;
		
		System.out.println("\nDuração: "+ horas + "horas " + minutos + "minutos e " + restoSegundos + " segundos");
		
		
		
	}

}
