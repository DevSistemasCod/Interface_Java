import java.util.HashMap;
import java.util.Map;

public class EstoqueLojaFisica implements Estoque {
    private Map<String, Integer> produtos;

    public EstoqueLojaFisica() {
        produtos = new HashMap<>();
    }

    @Override
    public void adicionarProduto(String nome, int quantidade) {
        produtos.put(nome, produtos.getOrDefault(nome, 0) + quantidade);
        System.out.printf("[Loja Física] Produto '%s' adicionado: +%d unidades.%n", nome, quantidade);
    }

    @Override
    public void removerProduto(String nome, int quantidade) {
        if (produtos.containsKey(nome) && produtos.get(nome) >= quantidade) {
            produtos.put(nome, produtos.get(nome) - quantidade);
            System.out.printf("[Loja Física] Produto '%s' removido: -%d unidades.%n", nome, quantidade);
        } else {
            System.out.printf("[Loja Física] Erro: quantidade insuficiente ou produto inexistente (%s).%n", nome);
        }
    }

    @Override
    public void exibirEstoque() {
        System.out.println("\n[Estoque - Loja Física]");
        produtos.forEach((nome, qtd) -> System.out.printf("%s: %d unidades%n", nome, qtd));
    }
}