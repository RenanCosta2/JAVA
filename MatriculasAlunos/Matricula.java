package MatriculasAlunos;

import java.util.Scanner;

public class Matricula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Matricula: ");
        int mat = input.nextInt();
        System.out.print("n1: ");
        double n1 = input.nextDouble();
        System.out.print("n2: ");
        double n2 = input.nextDouble();
        System.out.print("nT: ");
        double nT = input.nextDouble();

        Aluno aluno1 = new Aluno(mat, nome, n1, n2, nT);

        aluno1.mostraDados();

        input.close();
    }
}
