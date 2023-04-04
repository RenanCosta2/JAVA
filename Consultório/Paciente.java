public class Paciente implements Comparable<Paciente> {
    private String rg;
    private int idade;
    
    public Paciente(String rg, int idade) {
        this.rg = rg;
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public int getIdade() {
        return idade;
    }
    
    @Override
    public int compareTo(Paciente outro) {
        return Integer.compare(idade, outro.idade);
    }

    @Override
    public String toString() {
        return "Paciente [rg=" + rg + ", idade=" + idade + "]";
    }
    
}
