package Figuras;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        circulo.desenha();
        quadrado.desenha();
        triangulo.desenha();

        Desenho desenho1 = new Desenho(circulo, quadrado, 10, 10, 20, 20);
        Desenho desenho2 = new Desenho(quadrado, triangulo, 10, 10, 20, 20);

        desenho1.apresenta();
        desenho2.apresenta();
    }
}
