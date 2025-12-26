import java.util.ArrayList;

public class TestePrincipalPagto {
    public static void main(String[] args) {

        // Lista polimórfica de pagamentos
        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        // Instanciando diferentes tipos de pagamento
        Pagamento pagamento1 = new PagamentoCartao();
        Pagamento pagamento2 = new PagamentoDinheiro();

        // Adicionando à lista
        pagamentos.add(pagamento1);
        pagamentos.add(pagamento2);

        // Valor base da compra
        double valorCompra = 200.00;

        System.out.println("=== Processamento de Pagamentos ===");
        for (Pagamento pagamento : pagamentos) {
            System.out.println("\n--- Novo pagamento ---");
            pagamento.processarPagamento(valorCompra);  // Mesmo método, comportamentos diferentes
            pagamento.emitirRecibo();
        }
    }
}
