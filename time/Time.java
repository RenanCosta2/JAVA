import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        String estadio = input.nextLine();
        int win = input.nextInt();
        int lose = input.nextInt();
        int tie = input.nextInt();

        times time1 = new times(nome, estadio, win, lose, tie);

        time1.mostraDados();

        input.close();
    }
}
