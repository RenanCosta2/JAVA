package Matrizes;

public class ExecMatriz {
    public static void main(String[] args) {
        float matriz1[][] = {{1.4F, 3.5F}, {5.7F, 2.1F}};
        Matriz matriz = new Matriz(matriz1);

       float determinante = matriz.determinante();

       System.out.printf("%.2f\n\n", determinante);

        matriz.imprime();
    }
}
