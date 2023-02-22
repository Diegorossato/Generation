package POO;

public class Cliente {

	  // Atributos
	  private int id;
	  private String nome;
	  private String email;
	  private String telefone;
	  private String endereco;

	  // Construtor
	  public Cliente(int id, String nome, String email, String telefone, String endereco) {
	    this.id = id;
	    this.nome = nome;
	    this.email = email;
	    this.telefone = telefone;
	    this.endereco = endereco;
	  }

	  // Métodos Get e Set para id
	  public int getId() {
	    return id;
	  }
	  public void setId(int id) {
	    this.id = id;
	  }

	  // Métodos Get e Set para nome
	  public String getNome() {
	    return nome;
	  }
	  public void setNome(String nome) {
	    this.nome = nome;
	  }

	  // Métodos Get e Set para email
	  public String getEmail() {
	    return email;
	  }
	  public void setEmail(String email) {
	    this.email = email;
	  }

	  // Métodos Get e Set para telefone
	  public String getTelefone() {
	    return telefone;
	  }
	  public void setTelefone(String telefone) {
	    this.telefone = telefone;
	  }

	  // Métodos Get e Set para endereco
	  public String getEndereco() {
	    return endereco;
	  }
	  public void setEndereco(String endereco) {
	    this.endereco = endereco;
	  }

	  // Método visualizar
	  public void visualizar() {
	    System.out.println("ID: " + id);
	    System.out.println("Nome: " + nome);
	    System.out.println("E-mail: " + email);
	    System.out.println("Telefone: " + telefone);
	    System.out.println("Endereço: " + endereco);
	  }
	}


