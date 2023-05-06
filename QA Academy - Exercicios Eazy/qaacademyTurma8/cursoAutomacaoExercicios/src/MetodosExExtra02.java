public class MetodosExExtra02 {
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
    }
    
}
