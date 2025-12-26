public class Gerente implements Funcionario {
    private String nome;
    private double salarioMensal;

    public Gerente(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Gerente: %s | Salário: R$ %.2f%n", nome, calcularSalario());
    }
}
