// Classe Subtracao.java
public class Subtracao implements OperacaoMatematica {
    @Override
    public double calcular(double num1, double num2) {
        double resultado = 0;
        resultado = num1 - num2;
        return resultado;
    }
}
