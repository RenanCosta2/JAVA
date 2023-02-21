package Registro;

public class Matricula {
    public static void main(String[] args) {
        RegistroAcademico matricula1 = new RegistroAcademico("Renan", 1, 0.5);
        matricula1.mostraDados();
        RegistroAcademico matricula2 = new RegistroAcademico("Leite", 2, 0.4);
        matricula2.mostraDados();
        RegistroAcademico matricula3 = new RegistroAcademico("Costa", 3, 0.3);
        matricula3.mostraDados();
        
    }
}
