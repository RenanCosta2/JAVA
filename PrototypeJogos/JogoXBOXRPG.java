package PrototypeJogos;

public class JogoXBOXRPG extends JogoXBOX {
    private Prototype Jogo;

    public JogoXBOXRPG(String nome, String descricao, String categoria, float preco, Prototype jogo) {
        super(nome, descricao, "RPG", preco);
        Jogo = jogo;
    }

    @Override
    public JogoXBOXRPG clone(){
        return new JogoXBOXRPG(getNome(), getDescricao(), "RPG", getPreco(), Jogo);
    }
}
