package Matrizes;

public class Matriz {
    private float matriz[][] = new float[2][2];

    public Matriz(float[][] matriz) {
        this.matriz = matriz;
    }

    public float determinante(){
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }

    public void imprime(){
        String str = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               str += (matriz[i][j] + " ");
            }
            str += "\n";
        }

        System.out.println(str);
    }
 
}
