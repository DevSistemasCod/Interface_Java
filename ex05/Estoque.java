public interface Estoque {
    void adicionarProduto(String nome, int quantidade);
    void removerProduto(String nome, int quantidade);
    void exibirEstoque();
}
