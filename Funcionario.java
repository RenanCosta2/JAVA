public class Funcionario {
    private String nome;
    private float salarioPorHora;
    private float salarioTotal;

    public Funcionario(String nome, float salarioPorHora) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.salarioPorHora = 2;
    }

    public void setSalarioTotal(int horasTrabalhadas) {
        this.salarioTotal = salarioPorHora * horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salarioPorHora=" + salarioPorHora + ", salarioTotal=" + salarioTotal
                + "]";
    }

    
    
}
