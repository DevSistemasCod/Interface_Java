public class PagamentoDinheiro implements Pagamento {
    private double valorFinal;

    @Override
    public void processarPagamento(double valor) {
        // Aplica desconto de 5%
        valorFinal = valor - (valor * 0.05);
        System.out.printf("Pagamento em dinheiro processado. Valor com desconto: R$ %.2f%n", valorFinal);
    }

    @Override
    public void emitirRecibo() {
        System.out.printf("Recibo: Pagamento em Dinheiro | Valor final: R$ %.2f%n", valorFinal);
    }
}
