package AppLampada;

public class DefLamp {
    public static void main(String[] args) {
        ObjLamp lampada = new ObjLamp(); 

        lampada.mostraEstado();
        lampada.acende();
        lampada.acende();
        lampada.acende();
        lampada.acende();
        lampada.acende();
        lampada.mostraEstado();
        lampada.apaga();
        lampada.mostraEstado();
        lampada.mostraEstado();
        lampada.quantidadeAcesa();
        System.out.println(lampada.estaLigada());

    }
}
