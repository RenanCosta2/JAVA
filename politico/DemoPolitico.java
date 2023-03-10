package politico;

public class DemoPolitico {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Renan", 19, "07769719305", "Solteiro");
        Politico politico = new Politico(pessoa, "patido!!");
        Prefeito prefeito = new Prefeito(pessoa, "patido!!", "Iracema");
        Governador governador = new Governador(pessoa, "patido!!", "Ceará");

        System.out.println(pessoa);
        System.out.println(politico);
        System.out.println(prefeito);
        System.out.println(governador);
    }
    

}
