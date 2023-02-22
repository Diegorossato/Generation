package POO;

public class TestaCliente {

	  public static void main(String[] args) {
	  
	    // Instanciando dois objetos da Classe Cliente
	    Cliente cliente1 = new Cliente(1, "João da Silva", "joao.silva@gmail.com", "(11) 99999-1111", "Rua das Flores, 123");
	    Cliente cliente2 = new Cliente(2, "Maria Santos", "maria.santos@gmail.com", "(11) 99999-2222", "Avenida Paulista, 456");

	    // Exibindo os dados dos dois objetos utilizando o Método visualizar()
	    System.out.println("Dados do cliente 1:");
	    cliente1.visualizar();

	    System.out.println("\nDados do cliente 2:");
	    cliente2.visualizar();
	  }
	}
