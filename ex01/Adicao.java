public class Adicao implements OperacaoMatematica {
    @Override
    public double calcular(double num1, double num2) {
        double resultado = num1 + num2;
        return resultado;
    }
}
