package nComplexo;

public class Representar {
    private int nReal;
    private int nImaginario;

    public Representar(int nReal, int nImaginario) {
        this.nReal = nReal;
        this.nImaginario = nImaginario;
    }

    public Representar(int nReal) {
        this.nReal = nReal;
        this.nImaginario = 0;
    }

    public Representar() {
        this.nReal = 0;
        this.nImaginario = 0;
    }

    public String toString(){
        return "Número complexo: " + nReal + " + " + "i" + nImaginario;
    }
    

}
