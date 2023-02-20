import java.util.Scanner;

public class graus {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma temperatura em celsius: ");
        
        float celsius = input.nextFloat();

        System.out.printf("A temperatura de %f graus celsius em Fahrenheit é %f", celsius, 1.8*celsius + 32);

        input.close();

    }
}
