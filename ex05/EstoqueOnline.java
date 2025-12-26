import java.util.HashMap;
import java.util.Map;

public class EstoqueOnline implements Estoque {
    private Map<String, Integer> produtos;

    public EstoqueOnline() {
        produtos = new HashMap<>();
    }

    private void simularProcessamento() {
        try {
            System.out.print("(Processando atualização online...)\n");
            Thread.sleep(1000); // simula atraso de 1 segundo
        } catch (InterruptedException e) {
            System.out.println("Erro durante processamento!");
        }
    }

    @Override
    public void adicionarProduto(String nome, int quantidade) {
        simularProcessamento();
        produtos.put(nome, produtos.getOrDefault(nome, 0) + quantidade);
        System.out.printf("[Loja Online] Produto '%s' adicionado: +%d unidades.%n", nome, quantidade);
    }

    @Override
    public void removerProduto(String nome, int quantidade) {
        simularProcessamento();
        if (produtos.containsKey(nome) && produtos.get(nome) >= quantidade) {
            produtos.put(nome, produtos.get(nome) - quantidade);
            System.out.printf("[Loja Online] Produto '%s' removido: -%d unidades.%n", nome, quantidade);
        } else {
            System.out.printf("[Loja Online] Erro: quantidade insuficiente ou produto inexistente (%s).%n", nome);
        }
    }

    @Override
    public void exibirEstoque() {
        System.out.println("\n[Estoque - Loja Online]");
        produtos.forEach((nome, qtd) -> System.out.printf("%s: %d unidades%n", nome, qtd));
    }
}
