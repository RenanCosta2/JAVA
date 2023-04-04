package Consultório;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Atendimento {
    public static void main(String[] args) {
        LinkedList<Paciente> pacientesComuns = new LinkedList<>();
        PriorityQueue<Paciente> pacientesIdosos = new PriorityQueue<>();
    }

    public static int calcularDigitoVerificadorRG(int[] rg){
        int soma = 0;
        for (int i = 0; i < 8; i++) {
            soma += rg[i] * (2 + i);
        }
        int digito = 11 - (soma % 11);
        if (digito == 10) {
            digito = 0;
        } else if(digito == 11){
            digito = 1;
        }

        return digito;
    }
}
