import java.util.Scanner;

public class horario{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor em minutos: ");
        int tempo = input.nextInt();

        int dias = tempo/60/24;
        int horas = tempo/60-dias*24;
        int minutos = tempo-horas*60-dias*24*60;

        System.out.printf("%i = %f.0 dias %f.0 horas %f.0 minutos", tempo, dias, horas, minutos);

        input.close();
    }
}
