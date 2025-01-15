public class OperadoresBoolean {
    //PARTE DE COMPARAÇÃO
    public static void main(String[] args){

        //JEITO COMUM////////////////////////////
        int a, b;
        
        a = 5;
        b = 6;

        String resultado = "";

        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);
        /////////////////////////////////////////
        
        ////JEITO MAIS CORRETO//////////////////
        String resultado1 = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado1);

        ////////////////////////////////////////
        compara();
    }
    
    public static void compara() {
        String nomeUm = "LUIZ";
        String nomeDois = "LUIZ";


        //FUNCIONA MAS  NÃO É O MAIS CORRETO, É RECOMENDADO QUANDO SE TRATA DE NUMEROS
        System.out.println(nomeUm == nomeDois);

        //FUNCIONA E É O MAIS CORRETO POIS COMPARA OBJETOS INTEIROS, RECOMENDADO QUANDO SE USA STRING
        System.out.println(nomeUm.equals(nomeDois));


        int N1 = 1;
        int N2 = 2;

        boolean simNao = N1 != N2;

        System.out.println("N1 é diferente do N2? " + simNao);
    }
}
