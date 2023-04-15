public class ExMetodo {
    public static void main(String[] args) throws Exception {
            //Faça a soma de 2 numeros
            ExMetodo soma = new ExMetodo();
           System.out.println(soma.somaValores());     
         
    }
    public int somaValores(){
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 + numero2;

        return resultado;
    }
}
