package entidades;


// Classe Livro que implementa Produto
public class Livro implements Produto {
    private String nome;
    private double preco;
    private int quantidade;

    @Override
    public void adicionarProduto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== Livro ===");
        System.out.println("Título: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println();
    }
}
