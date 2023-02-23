package Questões_GPT.Atributos_Metodos_1;

public class SacarDepositar {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000, 45);

        conta.depositar(1000);
        conta.sacar(10);

        System.out.println(conta.getSaldo());
    }
}
