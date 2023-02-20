package CodElevador;

public class ObjElevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidade;
    private int quantPessoas = 0;

    public void inicializa(int cap, int total){
        this.totalAndares = total;
        this.capacidade = cap;
    }

    public void entra(){
        if (this.quantPessoas < this.capacidade) {
            this.quantPessoas++;
        } else{
            System.out.println("O elevador está lotado");
        }
    }

    public void sai(){
        if (this.quantPessoas > 0) {
            quantPessoas--;
        } else{
            System.out.println("Não tem ninguém no elevador!");
        }
    } 

    public void sobe(){
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else{
            System.out.println("O elevador já está no último andar!");
        }
    }

    public void desce(){
        if (andarAtual != 0) {
            andarAtual--;
        } else{
            System.out.println("O elevador já está no térreo!");
        }
    }

}
