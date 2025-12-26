// Classe Divisao.java
public class Divisao implements OperacaoMatematica {
    @Override
    public double calcular(double num1, double num2){
        double resultado = 0;

        if(num2 != 0){
            resultado = num1 / num2;
            return resultado;
        }
        return 0;
    }
}
