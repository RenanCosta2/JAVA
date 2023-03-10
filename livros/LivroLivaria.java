package livros;

public class LivroLivaria extends Livro {
    private float preco;
    private int estoque;
    
    public LivroLivaria(String titulo, String autor, String genero, String numPaginas, String editora,
            String anoLancamento, float preco, int estoque) {
        super(titulo, autor, genero, numPaginas, editora, anoLancamento);
        this.preco = preco;
        this.estoque = estoque;
    }

    public LivroLivaria(Livro livro, float preco, int estoque) {
        super(livro.getTitulo(), livro.getAutor(), livro.getGenero(), livro.getNumPaginas(), livro.getEditora(), livro.getAnoLancamento());
        this.preco = preco;
        this.estoque = estoque;
    }



    @Override
    public String toString() {
        return super.toString() + " [preco=" + preco + ", estoque=" + estoque + "]";
    }

    
}
