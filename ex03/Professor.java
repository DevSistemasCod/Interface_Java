public class Professor implements Funcionario {
    private String nome;
    private double horasTrabalhadas;
    private double valorHora;

    public Professor(String nome, double horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Professor: %s | Salário: R$ %.2f%n", nome, calcularSalario());
    }
}
