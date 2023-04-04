package Funcionarios;

public class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(float valor){
        this.salario += valor;
    }

    public float ganhoAnual(){
        return salario * 13;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
    }

}
