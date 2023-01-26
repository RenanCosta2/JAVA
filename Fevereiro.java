import java.util.Scanner;

public class Fevereiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o dia do mês de fevereiro: ");
        int dia = input.nextInt();

        if(dia < 1 || dia > 28){
            System.out.println("Dia inválido!");
        }else if(dia % 7 == 0){
            System.out.printf("O dia %d será um sábado", dia);
        }else if(dia % 7 == 1){
            System.out.printf("O dia %d será um domingo", dia);
        }else if(dia % 7 == 2){
            System.out.printf("O dia %d será um segunda-feira", dia);
        }else if(dia % 7 == 3){
            System.out.printf("O dia %d será um terça-feira", dia);
        }else if(dia % 7 == 4){
            System.out.printf("O dia %d será um quarta-feira", dia);
        }else if(dia % 7 == 5){
            System.out.printf("O dia %d será um quinta-feira", dia);
        }else if(dia % 7 == 6){
            System.out.printf("O dia %d será um sexta-feira", dia);
        }








        input.close();
    }
}
