package evento;

public class EventoHeranca extends DataHora {
    private String nome;

    public EventoHeranca(int ano, int mes, int dia, int hora, int minuto, int segundo, String nome) {
        super(ano, mes, dia, hora, minuto, segundo);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "EventoHeranca [nome=" + nome + "] \n" + super.toString();
    }

    
}
