package POO;

public class Produto {
    
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private boolean disponivel;
    
    public Produto(int codigo, String nome, String descricao, double preco, boolean disponivel) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.disponivel = disponivel;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public void visualizar() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Disponível: " + disponivel);
    }
}
