public class MetodosEx02 {
    //2- Criar 1 métodos com retorno que monte uma frase com os valores que recebeu por parâmetro
    public static String texto(String primeiroTexto, String segundoTexto){
        String resultado = primeiroTexto+segundoTexto;
        return resultado;
    }   
    //3- Criar 1 métodos com retorno que some dois valores e se for maior que 100, retorne true. Caso contrário, retorne false.

    public static boolean maiorQueCem(int valor1, int valor2){
        int resultado = valor1+valor2;
        if(resultado>100){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        // Ex02
        String primeiroTexto = "Primeiro texto leitura";
        String segundoTexto = "Segundo texto concatena";
        System.out.println(texto(primeiroTexto, segundoTexto));

       //Ex03
        int numero2 = 12;
        int numero3 = 8;
        int numero4 = 15;
        int numero5 = 305;
       
        System.out.println(maiorQueCem(numero2, numero5));
    }
}
