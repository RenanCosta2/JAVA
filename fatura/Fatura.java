package fatura;

import java.util.Scanner;

public class Fatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int id = input.nextInt();
        String desc = input.next();
        int quantidade = input.nextInt();
        double preco = input.nextDouble();

        calculaFatura produto = new calculaFatura(id, desc, quantidade, preco);

        double fatura = produto.calculaTotal();

        System.out.println("Fatura: " + fatura);

        input.close();
    }
}
