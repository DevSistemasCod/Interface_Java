import java.util.ArrayList;

public class MainEstoque {
    public static void main(String[] args) {
        ArrayList<Estoque> estoques = new ArrayList<>();

        Estoque lojaFisica = new EstoqueLojaFisica();
        Estoque lojaOnline = new EstoqueOnline();

        estoques.add(lojaFisica);
        estoques.add(lojaOnline);


        for (Estoque estoque  : estoques) {
            estoque .adicionarProduto("Caneta", 50);
            estoque .adicionarProduto("Caderno", 20);
            estoque .removerProduto("Caneta", 10);
            estoque .exibirEstoque();
            System.out.println("--------------------------------");
        }
    }
}
