package Funcionarios;

public class Assistente extends Funcionario {
    private String matricula;

    public Assistente(String nome, float salario, String matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + " Assistente [matricula=" + matricula + "]";
    }

    
    
}
