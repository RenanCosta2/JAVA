package Agenda;

public class ExecAgenda {
    public static void main(String[] args) {
        EntradaEmAgenda agenda1 = new EntradaEmAgenda(1, 3, 3, 2023, "Belo assunto");

        Agenda agenda = new Agenda();

        agenda.compromissos(agenda1);

        agenda.listaDia(3, 3, 2023);
        agenda.listaDia(5, 3, 2023);
        
    }
}
