package Figuras;

public class Desenho {
    FiguraGeometrica figura1;
    FiguraGeometrica figura2;
    private float x1, y1, x2, y2;

    public Desenho(FiguraGeometrica figura1, FiguraGeometrica figura2, float x1, float y1, float x2, float y2) {
        this.figura1 = figura1;
        this.figura2 = figura2;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void apresenta(){
        System.out.println("Coordenadas da figura 1: " + x1 +", " + y1);
        figura1.desenha();
        System.out.println("Coordenadas da figura 2: " + x2 +", " + y2);
        figura2.desenha();
    }
    
}
