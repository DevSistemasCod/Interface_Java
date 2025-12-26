// Classe Principal.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalOperacoes {
    public static void main(String[] args) {
        double numero1, numero2, resultado;
        Scanner lerTeclado = new Scanner(System.in);
        ArrayList<OperacaoMatematica> operacaoMatematicas = new ArrayList<>();

        Adicao adicao = new Adicao();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        operacaoMatematicas.add(adicao);
        operacaoMatematicas.add(subtracao);
        operacaoMatematicas.add(multiplicacao);
        operacaoMatematicas.add(divisao);

        System.out.println("Informe o numero1: ");
        numero1 = lerTeclado.nextDouble();

        System.out.println("Informe o numero2: ");
        numero2 = lerTeclado.nextDouble();

        for (OperacaoMatematica operacaoMatematica : operacaoMatematicas){
            resultado = operacaoMatematica.calcular(numero1, numero2);
            System.out.println(resultado);
        }

        lerTeclado.close();
    }
}
