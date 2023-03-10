package livros;

public class DemoLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("titulo", "autor", "genero", "300", "editora", "2023");
        LivroLivaria livroLivraria = new LivroLivaria(livro, 40.5F, 30);
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca(livro, 4, 5, true, 15);

        System.out.println(livro);
        System.out.println(livroBiblioteca);
        System.out.println(livroLivraria);
    }
}
