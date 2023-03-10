package livros;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private String numPaginas;
    private String editora;
    private String anoLancamento;

    public Livro(String titulo, String autor, String genero, String numPaginas, String editora, String anoLancamento) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numPaginas = numPaginas;
        this.editora = editora;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public String getEditora() {
        return editora;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", numPaginas=" + numPaginas
                + ", editora=" + editora + ", anoLancamento=" + anoLancamento + "]";
    }
    
}
