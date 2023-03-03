package Agenda;
import java.time.LocalDate;

public class EntradaEmAgenda {
    private int hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto) {
        setHora(hora);
        setMes(mes);
        setAno(ano);
        setDia(dia);
        this.assunto = assunto;
    }

    public void setHora(int hora) {
        if (hora < 1 || hora > 24) {
            throw new IllegalArgumentException("Hora inválida!");
        }
        this.hora = hora;
    }

    public void setDia(int dia) {
        verificaDia(dia, this.mes, this.ano);
        this.dia = dia;
    }

    public void setMes(int mes) {
        verificaMes(mes);
        this.mes = mes;
    }

    public void setAno(int ano) {
        verificaAno(ano);
        this.ano = ano;
    }

    public String toString(){
        String str;
        str = "Às " + hora + " hora(s) da data " + String.format("%02d", dia) + "/" + String.format("%02d", mes) + "/" + ano + "\n\n" + assunto;

        return str;
    }

    public boolean ehNoDia(int dia, int mes, int ano){
        EntradaEmAgenda.verificaDia(dia, mes, ano);
        EntradaEmAgenda.verificaMes(mes);
        EntradaEmAgenda.verificaAno(ano);

        if (dia == this.dia && mes == this.mes && ano == this.ano) {
            return true;
        }else{
            return false;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public static void verificaDia(int dia, int mes, int ano){
        LocalDate dataAtual = LocalDate.now();
        int diaAtual = dataAtual.getDayOfMonth();
        
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                if (dia < 1 || dia > 31 || dia < diaAtual) {
                    throw new IllegalArgumentException("Dia inválido!");
                }
                
                break;
            case 4:
            case 6:
            case 9:
            case 11:

                if (dia < 1 || dia > 30 || dia < diaAtual) {
                    throw new IllegalArgumentException("Dia inválido!");
                }

                break;
            
            case 2:
                
                if (ano % 4 == 0) {
                    if (dia < 1 || dia > 29 || dia < diaAtual) {
                        throw new IllegalArgumentException("Dia inválido!");
                    }
                } else{
                    if (dia < 1 || dia > 28 || dia < diaAtual) {
                        throw new IllegalArgumentException("Dia inválido!");
                    }
                }

                break;
        }
    }

    public static void verificaMes(int mes){
        LocalDate dataAtual = LocalDate.now();
        int mesAtual = dataAtual.getMonthValue();
        if (mes < 1 || mes > 12 || mes < mesAtual) {
            throw new IllegalArgumentException("Mês inválido!");
        }
    }

    public static void verificaAno(int ano){
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        
        if (ano < anoAtual) {
            throw new IllegalArgumentException("Ano inválido!");
        }
    }

}
