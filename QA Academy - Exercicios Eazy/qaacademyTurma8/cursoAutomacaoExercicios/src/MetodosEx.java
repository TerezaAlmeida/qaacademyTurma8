public class MetodosEx {
    public void adicao(){
        int num3 = 65;
        int num4 = 50;
        System.out.println(num3 + num4);
    }
    public int subtracao(){
        int sub1 = 25;
        int sub2 = 56;
        int resultadoSub = sub1-sub2;
        return resultadoSub;
    }
    public static void main(String[] args){
  
        MetodosEx somaResultado = new MetodosEx();
        somaResultado.adicao();
        System.out.println(somaResultado.subtracao()*5);
    }
}
