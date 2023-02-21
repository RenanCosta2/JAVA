package Gen;

public class Generico <T> {
    
    private T atributo1;
    private T atributo2;
    private T atributo3;

    

    public Generico(T atributo1, T atributo2, T atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public int iguais(){
        if (atributo1 == atributo2) {
            if (atributo1 == atributo3) {
                return 3;
            }
            return 2;
        } else if(atributo1 == atributo3){
            if (atributo1 == atributo2) {
                return 3;
            }
            return 2;
        }else if(atributo2 == atributo3){
            if (atributo2 == atributo3) {
                return 3;
            }
            return 2;
        } else{
            return 0;
        }
    }

    public void imprime(){
        System.out.println("Atributos: 1- " + atributo1 + " 2- " + atributo2 + " 3- " + atributo3);
    }

}
