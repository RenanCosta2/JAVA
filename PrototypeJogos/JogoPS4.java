package PrototypeJogos;

public class JogoPS4 extends Prototype {
    private String nome;
    private String descricao;
    private String categoria;
    private String plataforma = "PS4";
    private float preco;

    public JogoPS4(String nome, String descricao, String categoria, float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public float getPreco() {
        return preco;
    }

    @Override
    public JogoPS4 clone(){
        return new JogoPS4(this.nome, this.descricao, this.categoria, this.preco);
    }
    
}
