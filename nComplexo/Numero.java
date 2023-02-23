package nComplexo;

public class Numero {
    public static void main(String[] args) {
        Representar complexo = new Representar();
        Representar nComplexo = new Representar(1);
        Representar complexos = new Representar(1, 4);

        System.out.println(complexo.toString());
        System.out.println(nComplexo.toString());
        System.out.println(complexos.toString());

    }
}
