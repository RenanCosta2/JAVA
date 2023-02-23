package Questões_GPT.Classes_1;

//Crie uma classe chamada Pessoa com os atributos nome e idade. Crie um construtor que inicializa esses atributos. Crie também métodos getters e setters para esses atributos.

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return "Nome: " + this.nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty() || nome == null) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getIdade() {
        return nome + " tem " + idade + " anos";
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("Idade inválida");
        }
        this.idade = idade;
    }

    

}
