package Gen;

public class GenExec {
    public static void main(String[] args) {
        
        Generico <Integer> atributo1 = new Generico<>(1, 1, 1);
        Generico <Integer> atributo2 = new Generico<>(1, 2, 1);
        Generico <Integer> atributo3 = new Generico<>(1, 2, 3);
        Generico <String> atributo4 = new Generico<>("Renan", "Renan", "Renan");
        Generico <String> atributo5 = new Generico<>("Renan", "Renan", "Costa");
        Generico <String> atributo6 = new Generico<>("Renan", "Costa", "Leite");

        System.out.println("Número de atributos iguais: " + atributo1.iguais());
        System.out.println("Número de atributos iguais: " + atributo2.iguais());
        System.out.println("Número de atributos iguais: " + atributo3.iguais());
        System.out.println("Número de atributos iguais: " + atributo4.iguais());
        System.out.println("Número de atributos iguais: " + atributo5.iguais());
        System.out.println("Número de atributos iguais: " + atributo6.iguais());

        atributo1.imprime();
        atributo2.imprime();
        atributo3.imprime();
        atributo4.imprime();
        atributo5.imprime();
        atributo6.imprime();
    }
}
