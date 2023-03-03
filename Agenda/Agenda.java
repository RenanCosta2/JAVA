package Agenda;

public class Agenda {
    private EntradaEmAgenda[] agenda = new EntradaEmAgenda[10];

    public void compromissos(EntradaEmAgenda agenda) {
        for (int i = 0; i < this.agenda.length; i++) {
            if (this.agenda[i] == null) {
                this.agenda[i] = agenda;
                break;
            }
        }
    }

    public void mostraDados(){
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] != null) {
                System.out.println(agenda[i].toString() + "\n");
            }
            
        }
    }

    public void listaDia(int dia, int mes, int ano){
        EntradaEmAgenda.verificaDia(dia, mes, ano);
        EntradaEmAgenda.verificaMes(mes);
        EntradaEmAgenda.verificaAno(ano);

        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] != null) {
                if (dia == agenda[i].getDia() && mes == agenda[i].getMes() && ano == agenda[i].getAno()) {
                    System.out.println(agenda[i].toString());
                }
            }
        }
    }

}
