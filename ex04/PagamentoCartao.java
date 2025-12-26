public class PagamentoCartao implements Pagamento {
    private double valorFinal;

    @Override
    public void processarPagamento(double valor) {
        // Aplica taxa de 2,5%
        valorFinal = valor + (valor * 0.025);
        System.out.printf("Pagamento com cartão processado. Valor com taxa: R$ %.2f%n", valorFinal);
    }

    @Override
    public void emitirRecibo() {
        System.out.printf("Recibo: Pagamento via Cartão | Valor final: R$ %.2f%n", valorFinal);
    }
}