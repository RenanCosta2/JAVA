package MatriculasAlunos;

public class Aluno {
    private int matricula;
    private String nome;
    private double n1;
    private double n2;
    private double nT;

    public Aluno(int matricula, String nome, double n1, double n2, double nT) {
        this.matricula = matricula;
        this.nome = nome;
        setN1(n1);
        setN2(n2);
        setnT(nT);
    }

    private void setN1(double n1) {
        if (n1 < 0) {
            this.n1 = 0;
        } else{
            this.n1 = n1;
        }
    }

    private void setN2(double n2) {
        if (n2 < 0) {
            this.n2 = 0;
        } else{
            this.n2 = n2;
        }
    }

    private void setnT(double nT) {
        if (nT < 0) {
            this.nT = 0;
        } else{
            this.nT = nT;
        }
    }

    private double media(){
        return ((2.5*n1) + (2.5*n2) + (2*nT))/7;
    }

    private double Final(){
        double media = media();

        if (media < 7) {
            return 7 - media;
        } else{
            return 0;
        }
    }

    public void mostraDados(){
        System.out.println("Informações do aluno");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("n1: " + this.n1);
        System.out.println("n2: " + this.n2);
        System.out.println("nT: " + this.nT);
        System.out.println("Média: " + media());

        if(Final() != 0){
            System.out.println(this.nome + " precisa de " + Final() + " na prova final para passar");
        } else{
            System.out.println("Parabéns você está APROVADO!");
        }

    }
    
}
