package CodElevador;

import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ObjElevador elevador1 = new ObjElevador();

        elevador1.inicializa(5, 3);

        elevador1.entra();
        elevador1.entra();
        elevador1.entra();
        elevador1.entra();
        elevador1.entra();
        elevador1.entra();

        elevador1.sobe();
        elevador1.sobe();
        elevador1.sobe();
        elevador1.sobe();

        elevador1.desce();
        elevador1.desce();
        elevador1.desce();
        elevador1.desce();
        elevador1.desce();
        elevador1.desce();
        elevador1.desce();

        elevador1.sai();
        elevador1.sai();
        elevador1.sai();
        elevador1.sai();
        elevador1.sai();
        elevador1.sai();

        input.close();
    }
}
