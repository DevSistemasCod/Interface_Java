// Classe Multiplicacao.java
public class Multiplicacao implements OperacaoMatematica {
    @Override
    public double calcular(double num1, double num2) {
        double resultado = 0;
        resultado = num1 * num2;
        return resultado;
    }
}
