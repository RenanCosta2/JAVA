package fatura;
public class calculaFatura {
    private int numID;
    private String descricao;
    private int quantidade;
    private double preco;

    public calculaFatura(int numID, String descricao, int quantidade, double preco) {
        this.numID = numID;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPreco(preco);
    }

    private void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;
        } else{
            this.quantidade = quantidade;
        }
        
    }

    private void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0;
        } else{
            this.preco = preco;
        }
    }

    public double calculaTotal(){
        return this.quantidade * this.preco;
    }
    
}
