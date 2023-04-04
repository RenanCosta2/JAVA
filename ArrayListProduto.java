public class ArrayListProduto {
    public static void main(String[] args) {
        ArrayListProduto produto = new ArrayListProduto();

        System.out.println(produto.produto(2, 3 , 4, 5));
        System.out.println(produto.produto(4, 6, 2));
        System.out.println(produto.produto(6, 23));
        
    }

    public int produto(int ... numeros){
        int resultado = 1;
        for (int i = 0; i < numeros.length; i++) {
            resultado *= numeros[i];
        }

        return resultado;
    }

}
