package Agenda;

import java.util.ArrayList;

public class Agenda {
   ArrayList<EntradaEmAgenda> agenda = new ArrayList<>();
   
   public void compromissos(EntradaEmAgenda agenda){
        this.agenda.add(agenda);
   }

   public void mostraDados(){
        for (EntradaEmAgenda agendas : agenda) {
            System.out.println(agendas);
        }
   }

   public void listaDia(int dia, int mes, int ano){

        EntradaEmAgenda.verificaDia(dia, mes, ano);
        EntradaEmAgenda.verificaMes(mes);
        EntradaEmAgenda.verificaAno(ano);

        for (EntradaEmAgenda agendas : agenda) {
            if (agendas.getDia() == dia && agendas.getMes() == mes && agendas.getAno() == ano) {
                System.out.println(agendas);
            }
        }
   }
}
