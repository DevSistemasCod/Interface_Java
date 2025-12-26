package entidades;

// Classe Eletronico que implementa Produto
public class Eletronico implements Produto {
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
        System.out.println("=== Eletrônico ===");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println();
    }
}

