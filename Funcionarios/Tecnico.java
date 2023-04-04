package Funcionarios;

public class Tecnico extends Assistente {
    private float bonusSalarial;

    public Tecnico(String nome, float salario, String matricula, float bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }
    
    public float ganhoAnual(int meses){
        return (getSalario()+bonusSalarial) * 13;
    }

}
