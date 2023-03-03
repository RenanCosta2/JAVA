package Clientes;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String telefone;

    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade inválida!");
        }
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        if (telefone.length() != 11) {
            throw new IllegalAccessError("Telefone inválido");
        }
        this.telefone = telefone;
    }



}
