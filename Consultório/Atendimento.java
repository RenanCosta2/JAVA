import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

public class Atendimento {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        LinkedList<Paciente> pacientesComuns = new LinkedList<>();
        PriorityQueue<Paciente> pacientesIdosos = new PriorityQueue<>();
        int minutos = 1;
        Random random = new Random();

        while (true) {

            if (minutos % 4 == 0 && pacientes.size() != 20) {
                int[] rg = new int[9];
                for (int i = 0; i < 8; i++) {
                    rg[i] = random.nextInt(10);
                }
                rg[8] = calcularDigitoVerificadorRG(rg);
                String rgString = Arrays.toString(rg);
                int idade = random.nextInt(100);

                Paciente paciente = new Paciente(rgString, idade);

                pacientes.add(paciente);

                if (paciente.getIdade() > 60) {
                    pacientesIdosos.add(paciente);
                } else{
                    pacientesComuns.add(paciente);
                }

                System.out.println("\nPaciente " + paciente.toString() + " na fila...");
            }

            System.out.println("\nPacientes na fila: ");

            for (Paciente paciente : pacientesIdosos) {
                System.out.println(paciente);
                
            }
            for (Paciente paciente : pacientesComuns) {
                System.out.println(paciente);
                
            }

            if(minutos % 5 == 0){
                if (!pacientesIdosos.isEmpty()) {
                    System.out.println("\n" + pacientesIdosos.poll() + " está sendo atendido...");
                } else if(!pacientesComuns.isEmpty()){
                    System.out.println("\n" + pacientesComuns.pollFirst() + " está sendo atendido...");
                }
            } 

            minutos++;

            if (pacientes.size() == 20 && pacientesComuns.isEmpty() && pacientesIdosos.isEmpty()) {
                minutos += 5;
                System.out.println("Consultório fechado!");
                break;
            }
            
        }
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
