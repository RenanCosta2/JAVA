public class times {
    private String nome;
    private String estadio;
    private int wins;
    private int loses;
    public int ties;
    private int pontos;


    public times(String nome, String estadio, int wins, int loses, int ties) {
        this.nome = nome;
        this.estadio = estadio;
        this.wins = wins;
        this.loses = loses;
        this.ties = ties;
    }

    private void Qpontos(int w, int t){
        pontos = 3 * w + t;

    }

    public void mostraDados(){

        Qpontos(wins, ties);

        System.out.println("Nome do time: " + this.nome);
        System.out.println("Estádio: " + this.estadio);
        System.out.println("Vitórias: " + this.wins);
        System.out.println("Derrotas: " + this.loses);
        System.out.println("Empates: " + this.ties);
        System.out.println("Pontos: " + this.pontos);

    }
    
}
