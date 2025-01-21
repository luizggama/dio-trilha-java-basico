public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 998.0;
        double valorSolitado = 998.1;

        if (valorSolitado <= saldo) {
            saldo -= valorSolitado;
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual é de: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
            System.out.println("Valor disponível na conta: " + saldo);
        }
    }
}