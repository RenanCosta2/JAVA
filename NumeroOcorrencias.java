import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class NumeroOcorrencias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<String> letras = new LinkedList<>();

        System.out.print("Digite uma string: ");
        String string = input.nextLine();

        string = string.replace(" ", "");

        for (char c : string.toCharArray()) {
            letras.add(String.valueOf(c));
        }

        TreeMap<String, Integer> mapa = new TreeMap<>();

        for (String letra : letras) {
            if (mapa.containsKey(letra.toUpperCase())) {
                mapa.put(letra.toUpperCase(), mapa.get(letra.toUpperCase()) + 1);
            } else{
                mapa.put(letra.toUpperCase(), 1);
            }
        }

        for (String letra : mapa.keySet()) {
            System.out.println(letra + " " + mapa.get(letra));
        }

        input.close();
    }
}
