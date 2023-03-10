package livros;

public class LivroBiblioteca extends Livro {
    private int prateleira;
    private int corredor;
    private boolean status;
    private int prazoDevolucao;

    public LivroBiblioteca(String titulo, String autor, String genero, String numPaginas, String editora,
            String anoLancamento, int prateleira, int corredor, boolean status, int prazoDevolucao) {

        super(titulo, autor, genero, numPaginas, editora, anoLancamento);
        this.prateleira = prateleira;
        this.corredor = corredor;
        this.status = status;
        this.prazoDevolucao = prazoDevolucao;
    }

    public LivroBiblioteca(Livro livro, int prateleira, int corredor, boolean status, int prazoDevolucao) {
        super(livro.getTitulo(), livro.getAutor(), livro.getGenero(), livro.getNumPaginas(), livro.getEditora(), livro.getAnoLancamento());
        this.prateleira = prateleira;
        this.corredor = corredor;
        this.status = status;
        this.prazoDevolucao = prazoDevolucao;
    }



    @Override
    public String toString() {
        return super.toString() + " [prateleira=" + prateleira + ", corredor=" + corredor + ", status=" + status
                + ", prazoDevolucao=" + prazoDevolucao + "]";
    }

    
    
}
