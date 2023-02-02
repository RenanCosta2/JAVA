import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        int base = input.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = input.nextInt();

        System.out.println(base + "^" + expoente + " = " + potencia(base, expoente));

        input.close();
    }

    public static int potencia(int base, int potencia){

        if(potencia == 0){
            return 1;
        } else{
            return base * potencia(base, potencia - 1);
        }

    }

}
