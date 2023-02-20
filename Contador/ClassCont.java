package Contador;

public class ClassCont {
    private int contador;

    public void zerar(){
        this.contador = 0;
    }

    public void incremento(){
        this.contador++;
    }

    public void imprimir(){
        System.out.println("Valor do contador: " + this.contador);
    }

}
