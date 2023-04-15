public class MetodosEx {
    public static void adicao(){
        int num3 = 65;
        int num4 = 50;
        System.out.println(num3 + num4);
    }
    public static int subtracao(){
        int sub1 = 25;
        int sub2 = 56;
        int resultadoSub = sub1-sub2;
        return resultadoSub;
    }
    // Criar um metodo sem retorno
    public static void soma(){
        int soma1 = 1;
        int soma2 = 2;
        System.out.println(soma1+soma2);
    }

    //Crie um método que retorne a multiplicação de 2 valores e imprima o resultado no método main.
    public static int multiplicacao(){
        int mult1 = 3;
        int mult2 = 5;
        int resultado = mult1 * mult2;
        return resultado;
    }
    //Crie um método que retorne uma frase e imprima no método main. 
    public static String texto(){
        String oTexto = "Bom-dia-Hoje";
        return oTexto;
    }

    public static void somaParametros(int numero1, int numero2){

        System.out.println(numero1+numero2);
    }

    public static int multiplicacaoParametros(int numero1, int numero2, int numero3){
        int resultado = numero1 * numero2 * numero3;
        return resultado;
    
    }

    public static boolean ensolarado(boolean estaEnsolarado){
        if (estaEnsolarado == false){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void main(String[] args){
        int numero1= 10;
        int numero2 = 20;
        int numero3 = 30;
        somaParametros(numero1,numero2);
        System.out.println(multiplicacaoParametros(numero1, numero2, numero3));
        System.out.println(ensolarado(false));
        //System.out.println(multiplicacao());
        //System.out.println(texto());
    }
}
