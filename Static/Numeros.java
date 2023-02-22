package Static;

public class Numeros {
    public static void main(String[] args) {
        
        System.out.println(Maior.maior(3, 7)); // retorna 7
        System.out.println(Maior.maior(3.2, 7.8)); // retorna 7.8
        System.out.println(Maior.maior(1, 2, 3)); // retorna 3
        System.out.println(Maior.maior(1.5, 2.5, 3.5)); // retorna 3.5
        System.out.println(Maior.maior(1, 2, 3, 4)); // retorna 4
        System.out.println(Maior.maior(1.5, 2.5, 3.5, 4.5)); // retorna 4.5
        System.out.println(Maior.maior(1, 2, 3, 4, 5)); // retorna 5
        System.out.println(Maior.maior(1.5, 2.5, 3.5, 4.5, 5.5)); // retorna 5.5

    }
}
