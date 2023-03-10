package evento;

public class DemoEvento {
    public static void main(String[] args) {
        DataHora dataHora = new DataHora(2023, 3, 10, 14, 29, 35);
        EventoDelegacao evento1 = new EventoDelegacao(dataHora, "evento1");
        EventoHeranca evento2 = new EventoHeranca(2023, 3, 10, 14, 30, 5, "evento2");

        System.out.println(evento1);
        System.out.println(evento2);
    }
}
