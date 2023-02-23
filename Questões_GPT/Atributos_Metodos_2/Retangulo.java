package Questões_GPT.Atributos_Metodos_2;

//Crie uma classe chamada Retangulo com os atributos largura e altura. Crie um método calcularArea() que retorna a área do retângulo.

public class Retangulo {
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public void setLargura(double largura) {
        if (largura <= 0) {
            throw new IllegalArgumentException("Largura inválida!");
        }
        this.largura = largura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura inválida!");
        }
        this.altura = altura;
    }

    public double Area(){
        return largura * altura;
    }

}
