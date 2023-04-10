package PrototypeJogos;

public class JogoSwitch extends Prototype {
    private String nome;
    private String descricao;
    private String categoria;
    private String plataforma = "Nintendo Switch";
    private float preco;

    public JogoSwitch(String nome, String descricao, String categoria, float preco) {
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public JogoSwitch clone(){
        return new JogoSwitch(this.nome, this.descricao, this.categoria, this.preco);
    }
    
}
