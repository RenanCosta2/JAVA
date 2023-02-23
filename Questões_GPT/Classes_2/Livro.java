package Questões_GPT.Classes_2;

import java.util.Calendar;

//Crie uma classe chamada Livro com os atributos titulo, autor e anoPublicacao. Crie um construtor que inicializa esses atributos. Crie também métodos getters e setters para esses atributos.

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    
    
    public Livro(String titulo, String autor, int anoPublicacao) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
    }
    public String getTitulo() {
        return "Nome do título: " + titulo;
    }
    public void setTitulo(String titulo) {
        if (titulo.isEmpty() || titulo == null) {
            throw new IllegalArgumentException("O título não pode estar vazio!");
        }
        this.titulo = titulo;
    }
    public String getAutor() {
        return "Nome do autor: " + autor;
    }
    public void setAutor(String autor) {
        if (autor.isEmpty() || autor == null) {
            throw new IllegalArgumentException("O autor não pode estar vazio!");
        }
        this.autor = autor;
    }
    public String getAnoPublicacao() {
        return "Ano de publicação: " +anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        //pensei em colocar 1455 porque foi a data que foi lançado a bíblia
        if (anoPublicacao > Calendar.getInstance().get(Calendar.YEAR) || anoPublicacao < 1455) {
            throw new IllegalArgumentException("O ano de publicação está incorreto!");
        }
        this.anoPublicacao = anoPublicacao;
    }
   

}
