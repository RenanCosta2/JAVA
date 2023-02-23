package Questões_GPT.Atributos_Metodos_2;

import java.text.DecimalFormat;

public class CriaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10.5, 2.4);

        DecimalFormat decimal = new DecimalFormat("#.##");

        System.out.println("Área do retângulo: " + decimal.format(retangulo.Area()));

    }
}
