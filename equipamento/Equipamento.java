package equipamento;
public class Equipamento {
    private String tipo;
    private String funcao;
    
    public Equipamento(String tipo, String funcao) {
        this.tipo = tipo;
        this.funcao = funcao;
    }

    public String gettipo() {
        return tipo;
    }

    public String getSoftware() {
        return funcao;
    }

    @Override
    public String toString() {
        return "Equipamento [tipo=" + tipo + ", funcao=" + funcao + "]";
    }
    
}
