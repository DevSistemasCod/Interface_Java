import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        // Adiciona diferentes tipos de funcionários
        funcionarios.add(new Professor("Ana Silva", 120, 60.0));
        funcionarios.add(new Professor("Pedro Souza", 100, 55.0));
        funcionarios.add(new Gerente("Mario Sanches", 8500.0));
        funcionarios.add(new Gerente("Fernanda Costa", 9500.0));

        System.out.println("=== Lista de Funcionários ===");
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirInformacoes();
        }
    }
}
