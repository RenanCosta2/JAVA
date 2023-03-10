package evento;

public class EventoDelegacao {
    private DataHora dataHora;
    private String nome;

    public EventoDelegacao(DataHora dataHora, String nome) {
        this.dataHora = dataHora;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "EventoDelegacao [dataHora=" + dataHora + ", nome=" + nome + "]";
    }

    
    
}
