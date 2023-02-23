package Questões_GPT.Atributos_Metodos_1;

import java.text.DecimalFormat;

//Crie uma classe chamada ContaBancaria com os atributos saldo e numero. Crie métodos depositar() e sacar() que atualizam o saldo da conta bancária.

public class ContaBancaria {
    private double saldo;
    private int numero;

    public ContaBancaria(double saldo, int numero) {
        setSaldo(saldo);
        setNumero(numero);
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo!");
        }
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Número de conta incorreto!");
        }
        this.numero = numero;
    }
   
    public void depositar(double valor){
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido!");
        }
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido!");
        } else if(valor > saldo){
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        this.saldo -= valor;
    }

    public String getSaldo() {
        DecimalFormat decimal = new DecimalFormat("#.##");
        return "O seu saldo atual é: " + decimal.format(saldo);
    }

    
}
