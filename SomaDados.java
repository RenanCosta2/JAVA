import java.util.Random;

public class SomaDados {
    public static void main(String[] args) {
        Random random = new Random();
        int soma[] = new int[11];

        for (int i = 0; i < 36000000; i++) {
            int n1 = random.nextInt(6) + 1;
            int n2 = random.nextInt(6) + 1;

            int somar = n1 + n2;

            if (somar == 2) {
                soma[0]++;
            } else if(somar == 3){
                soma[1]++;
            }
             else if(somar == 4){
                soma[2]++;
            }
             else if(somar == 5){
                soma[3]++;
            }
             else if(somar == 6){
                soma[4]++;
            }
             else if(somar == 7){
                soma[5]++;
            }
             else if(somar == 8){
                soma[6]++;
            }
             else if(somar == 9){
                soma[7]++;
            }
             else if(somar == 10){
                soma[8]++;
            }
             else if(somar == 11){
                soma[9]++;
            }
             else if(somar == 12){
                soma[10]++;
            }
        }
        
        for (int i = 0; i < soma.length; i++) {
            System.out.println("Quantidade de vezes que aparece o número " + (i+2) + ": " + soma[i]);
        }
    }
}
