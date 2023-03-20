package ArrayClientes;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecCliente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Clientes> clientes = new ArrayList<>();

        int id;
        String nome;
        int idade;
        String telefone;

        do {

            System.out.print("\nDigite seu id: ");
            id = input.nextInt();
            if (id < 0) {
                break;
            }
            System.out.print("Digite seu nome: ");
            nome = input.next();
            System.out.print("Digite sua idade: ");
            idade = input.nextInt();
            System.out.print("Digite seu telefone: ");
            telefone = input.next();

            Clientes cliente = new Clientes(id, nome, idade, telefone);

            clientes.add(cliente);
            
        } while (true);

        for (Clientes cadaCliente : clientes) {
            System.out.println(cadaCliente.toString());
        }

        input.close();
    }
}
