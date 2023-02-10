package AtividadeLogica;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner Leia = new Scanner(System.in);
		
		double custoFabrica, percentualDistribuidor, percentualImposto, custoDistribuidor, custoImposto, custoConsumidor;
		
		System.out.print("Entre com o custo de fábrica: ");
		
		custoFabrica = Leia.nextDouble();
		percentualDistribuidor = 0.28;
		percentualImposto = 0.45;
		custoDistribuidor = custoFabrica * percentualDistribuidor;
		custoImposto = custoFabrica * percentualImposto;
		custoConsumidor = custoFabrica + custoDistribuidor + custoImposto;
		
		System.out.print("O custo ao consumidor é: R$" + custoConsumidor);
					
				

	}

}
