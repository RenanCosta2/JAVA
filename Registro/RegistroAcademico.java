package Registro;

public class RegistroAcademico {
    private String nome;
    private int matricula;
    private int codigoCurso;
    private double percentualDeCobranca;
    private static int numeroDeMatriculas = 0;

    public RegistroAcademico(String n, int cod, double perc) {
        numeroDeMatriculas++;
        this.nome = n;
        this.matricula = numeroDeMatriculas;
        this.codigoCurso = cod;
        this.percentualDeCobranca = perc;
    }

    public static double calculaMensalidade(int codigoCurso, double percentualDeCobranca) {
        return 100 * codigoCurso * percentualDeCobranca;
    }

    public void mostraDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Código do Curso: " + this.codigoCurso);
        System.out.println("Mensalidade: " + calculaMensalidade(this.codigoCurso, this.percentualDeCobranca));
        System.out.println("Numero de matrículas: " + numeroDeMatriculas);
    }
}