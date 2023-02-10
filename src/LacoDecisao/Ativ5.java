package LacoDecisao;

import java.util.Scanner;

public class Ativ5 {

	public static void main(String[] args) {
		
		Scanner Leia = new Scanner(System.in);
		
		
		int codigo, quantidade;
		double valorTotal = 0.0;
		String nomeProduto = "";
		
		System.out.println("informe o código do produto (1 a 6): ");
		codigo = Leia.nextInt();
		System.out.println("Informe a quantidade comprada: ");
		quantidade = Leia.nextInt();
		
		switch (codigo) {
		case 1: 
			nomeProduto = "Cachorro-Quente";
			valorTotal = quantidade * 4.00;
			break;
		case 2: 
			nomeProduto = "X-Salada";
			valorTotal = quantidade * 4.00;
			break;
		case 3:
			nomeProduto = "X-Bacon";
			valorTotal = quantidade * 4.00;
			break;
		case 4:
			nomeProduto = "Torrada Simples";
			valorTotal = quantidade * 2.00;
			break;
		case 5:
			nomeProduto = "Refrigerante";
			valorTotal = quantidade * 1.50;
			break;
		case 6: 
			nomeProduto = "Agua";
			valorTotal = quantidade * 1.00;
			break;
		default:
			System.out.println("Código inválido");
			return;			
					
		}
		
		System.out.println("Produto: " + nomeProduto);
		System.out.println("Valor total da conta: R$" + valorTotal);
			
	}

}
