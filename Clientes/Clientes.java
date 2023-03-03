package Clientes;

import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Cliente> Clientes;

        int id;
        String nome;
        int idade;
        String telefone;

        do {
            System.out.print("ID: ");
            id = input.nextInt();
            System.out.print("Nome: ");
            nome = input.nextLine();
            System.out.print("Idade: ");
            idade = input.nextInt();
            System.out.print("Telefone: ");
            telefone = input.nextLine();

            Cliente cliente = new Cliente(id, nome, idade, telefone);

        } while (id >= 0);

        input.close();
    }
}
