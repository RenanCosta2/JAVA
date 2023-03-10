package evento;

public class DataHora {
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minuto;
    private int segundo;

    public DataHora(int ano, int mes, int dia, int hora, int minuto, int segundo) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return String.format("%02d", dia) + "/" +  String.format("%02d", mes) + "/" + ano + "\n" + String.format("%02d", hora) + ":" + String.format("%02d", minuto) + ":" + String.format("%02d", segundo) ;
    }

    
    
}
