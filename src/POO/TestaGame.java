package POO;

public class TestaGame {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "The Last of Us Part II", "Jogo de ação e aventura pós-apocalíptico", 199.99, true);
        Produto produto2 = new Produto(2, "FIFA 22", "Jogo de futebol com os principais times e jogadores do mundo", 249.99, false);
        
        produto1.visualizar();
        System.out.println("--------------------");
        produto2.visualizar();
    }
}
