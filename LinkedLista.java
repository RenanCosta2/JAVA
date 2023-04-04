import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLista {
    public static void main(String[] args) {
        LinkedList<String> palavra = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"));
        LinkedList<String> palavraCopia = new LinkedList<>();

        for (int i = palavra.size() - 1; i >= 0; i--) {
            palavraCopia.add(palavra.get(i));
        }

        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + palavraCopia);
    }
}
