package Funcionarios;

public class Administrativo extends Assistente {
    public String turno;
    public float adicionalNoturno;

    public Administrativo(String nome, float salario, String matricula, String turno, float adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public float ganhoAnual() {
        if (turno.equals("noite")) {
            return (getSalario() + adicionalNoturno) * 12 + getSalario();
        } else {
            return getSalario() * 13;
        }
    }

}
