public class ExCasa03 {
    
    public static boolean eDivisivelPorDois(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int meuValor = 1547;
        System.out.println(eDivisivelPorDois(meuValor));
    }
}
