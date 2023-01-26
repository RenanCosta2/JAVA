import java.util.Scanner;

public class Pontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a coordenada de dois pontos cartesianos");

        System.out.print("x1: ");
        float x1 = input.nextFloat();
        System.out.print("y1: ");
        float y1 = input.nextFloat();
        System.out.print("x2: ");
        float x2 = input.nextFloat();
        System.out.print("y2: ");
        float y2 = input.nextFloat();

        if(x2 > x1){
            if(y2 > y1){
                System.out.println("O segundo ponto está acima e à direita do primeiro ponto");
            } else if(y2 < y1){
                System.out.println("O segundo ponto está abaixo e à direita do primeiro ponto");
            } else{
                System.out.println("O segundo ponto está à direita do primeiro ponto");
            }
        } else if(x2 < x1){
            if(y2 > y1){
                System.out.println("O segundo ponto está acima e à esquerda do primeiro ponto");
            } else if(y2 < y1){
                System.out.println("O segundo ponto está abaixo e à esquerda do primeiro ponto");
            } else{
                System.out.println("O segundo ponto está à esquerda do primeiro ponto");
            }
        } else{
            System.out.println("Ambos pontos estão no mesmo lugar");
        }

        input.close();
    }
}
