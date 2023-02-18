package POO;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExFila {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Queue<String> filaClientes = new LinkedList<>();

		int opcao = -1;

		while (opcao != 0) {
			System.out.println("\n--- MENU ---");
			System.out.println("1 - Adicionar um novo cliente na fila");
			System.out.println("2 - Listar todos os clientes na fila");
			System.out.println("3 - Chamar (retirar) uma pessoa da fila");
			System.out.println("0 - Sair");

			System.out.print("Opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do cliente: ");
				String nome = scanner.nextLine();
				filaClientes.add(nome);
				System.out.println("Cliente adicionado com sucesso.");
				break;

			case 2:
				System.out.println("Clientes na fila:");
				for (String cliente : filaClientes) {
					System.out.println(cliente);
				}
				break;

			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("Fila vazia.");
				} else {
					String clienteChamado = filaClientes.remove();
					System.out.println("Cliente " + clienteChamado + " chamado.");
				}
				break;

			case 0:
				System.out.println("Programa finalizado.");
				break;

			default:
				System.out.println("Opção inválida.");
			}
		}
	}
}