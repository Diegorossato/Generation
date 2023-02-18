package POO;

import java.util.Scanner;
import java.util.Stack;

public class ExPilha {

	private static final String OPCAO_ADICIONAR_LIVRO = "1";
	private static final String OPCAO_LISTAR_LIVROS = "2";
	private static final String OPCAO_RETIRAR_LIVRO = "3";
	private static final String OPCAO_SAIR = "0";

	public static void main(String[] args) {

		Stack<String> pilhaDeLivros = new Stack<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			exibirMenu();
			String opcao = scanner.nextLine();

			switch (opcao) {
			case OPCAO_ADICIONAR_LIVRO:
				adicionarLivro(scanner, pilhaDeLivros);
				break;
			case OPCAO_LISTAR_LIVROS:
				listarLivros(pilhaDeLivros);
				break;
			case OPCAO_RETIRAR_LIVRO:
				retirarLivro(pilhaDeLivros);
				break;
			case OPCAO_SAIR:
				System.out.println("Finalizando o programa...");
				return;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}

	private static void exibirMenu() {
		System.out.println("Escolha uma opção:");
		System.out.println("1: Adicionar um novo livro na pilha");
		System.out.println("2: Listar todos os livros da Pilha");
		System.out.println("3: Retirar um livro da pilha");
		System.out.println("0: Finalizar o programa");
	}

	private static void adicionarLivro(Scanner scanner, Stack<String> pilhaDeLivros) {
		System.out.println("Digite o nome do livro:");
		String nomeDoLivro = scanner.nextLine();
		pilhaDeLivros.push(nomeDoLivro);
		System.out.println("Livro adicionado na pilha.");
	}

	private static void listarLivros(Stack<String> pilhaDeLivros) {
		if (pilhaDeLivros.isEmpty()) {
			System.out.println("A pilha está vazia.");
		} else {
			System.out.println("Livros na pilha:");
			for (String livro : pilhaDeLivros) {
				System.out.println(livro);
			}
		}
	}

	private static void retirarLivro(Stack<String> pilhaDeLivros) {
		if (pilhaDeLivros.isEmpty()) {
			System.out.println("A pilha está vazia.");
		} else {
			String livroRetirado = pilhaDeLivros.pop();
			System.out.println("Livro '" + livroRetirado + "' retirado da pilha.");
		}
	}
}
