public class OperadoresEeOU {
    public static void main(String[] args) {
        boolean condicao1=true;
        boolean condicao2=true;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
            System.exit(0);
        }

        if (condicao1 || condicao2){
            System.out.println("Uma das duas condições são verdadeiras");
           //System.exit(0);
        }

        System.out.println("Fim");
    }
}
