import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Número: ");
        int num = input.nextInt();

        int resultado = fat(num, 0, 1);

        input.close();
    }

    public static int fat(int num, int cont, int result){
        
        if(cont > num){
            return result;
        } else{
            if(cont == 0){
                System.out.println(cont + "! = 1");
            } else{
                result = cont * result;
                System.out.println("\t".repeat(cont) + cont + "! = " + result);
            }
            return fat(num, cont + 1, result);
        }
        
    }

}
