package ArrayClientes;

import java.util.Objects;

/*Crie um objeto de uma classe chamada Cliente com os atributos id, nome, idade, telefone. Faça um programa para solicitar os dados de vários clientes e armazenar em um ArrayList até que se digite um número de ID negativo. Em seguida, exiba os dados de todos os clientes. */

public class Clientes {
    private int id;
    private String nome;
    private int idade;
    private String telefone;

    public Clientes(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = Objects.requireNonNull(nome, "Nome inválido!");
        setIdade(idade);
        setTelefone(telefone);
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 140) {
            throw new IllegalArgumentException("Idade inválida!");
        }
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        if (telefone.length() != 11 && telefone.length() != 9) {
            throw new IllegalArgumentException("Telefone inválido!");
        }
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Clientes [id=" + id + ", nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "] \n";
    }

    
    
}
