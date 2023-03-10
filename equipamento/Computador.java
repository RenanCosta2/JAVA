package equipamento;
public class Computador extends Equipamento{
    private String cpu;
    private String gpu;
    
    public Computador(String tipo, String funcao, String cpu, String gpu) {
        super(tipo, funcao);
        this.cpu = cpu;
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return super.toString() + " Computador [cpu=" + cpu + ", gpu=" + gpu + "]";
    }

    
}
