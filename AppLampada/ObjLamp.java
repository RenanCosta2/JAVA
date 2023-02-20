package AppLampada;

public class ObjLamp {
    private boolean estadoDaLampada = false;
    private static int contador = 0;


    public void acende(){
        contador++;
        this.estadoDaLampada = true;
    }

    public void apaga(){
        this.estadoDaLampada = false;
    }

    public void mostraEstado(){
        if (this.estadoDaLampada == true) {
            System.out.println("A lâmpada está acesa!");
        } else{
            System.out.println("A lâmpada está apagada!");
        }
    }

    public boolean estaLigada(){
        if (this.estadoDaLampada == true) {
            return true;
        } else{
            return false;
        }
    }

    public void quantidadeAcesa(){
        System.out.println("A lâmpada foi acesa " + contador + " vezes!");
    }
}
