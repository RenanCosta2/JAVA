package Questões_GPT.Classes_2;

public class CadLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("O pequeno príncipe", "Antoine de Saint-Exupéry", 1943);

        System.out.println(livro.getTitulo());
        System.out.println(livro.getAutor());
        System.out.println(livro.getAnoPublicacao());
    }
}
