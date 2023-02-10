package LacoDecisao;

import java.util.Scanner;

public class Ativ6 {

	public static void main(String[] args) {
		
		Scanner Leia = new Scanner(System.in);
		
		System.out.println("Informe o nome do colaborador: ");
		String nome = Leia.nextLine();
		
		System.out.println("Informe o código do cargo (1-6): ");
		int cargo = Leia.nextInt();
		
		System.out.println("Informe o salário: ");
		float salario = Leia.nextFloat();
		
		float reajuste = 0.0f;
		String nomeCargo = "";
		
		switch (cargo) {
		case 1: 
			reajuste = 0.10f;
			nomeCargo = "Gerente";
			break;
		case 2:
			reajuste = 0.07f;
			nomeCargo = "Vendedor";
			break;
		case 3: 
			reajuste = 0.09f;
			nomeCargo = "Supervisor";
			break;
		case 4:
			reajuste = 0.06f;
			nomeCargo = "Motorista";
			break;
		case 5: 
			reajuste = 0.05f;
			nomeCargo = "Estoquista";
			break;
		case 6:
	        reajuste = 0.08f;
	        nomeCargo = "Técnico de TI";
	        break;
	      default:
	        System.out.println("Código de cargo inválido");	 
	        System.exit(0);
		}
		float novoSalario = salario + (reajuste * salario);

	    System.out.println("Nome do colaborador: " + nome);
	    System.out.println("Cargo: " + nomeCargo);
	    System.out.println("Novo salário: " + novoSalario);
	}

}
