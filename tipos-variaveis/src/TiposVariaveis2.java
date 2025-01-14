import java.util.Random;

public class TiposVariaveis2 {
    public static void main(String[] args) throws Exception {
        String meuNome = "Luiz Gustavo Gama Souza";
        double salarioMinimo = 2500;

        // Criar um objeto Random
        Random random = new Random();

        // Gerar um número aleatório entre 1 e 100
        int numeroCurto = random.nextInt(100) + 1;

        
        System.out.println("Olá, meu nome é " + meuNome + ", tenho 24 anos, meu salário é de " + salarioMinimo*2 + " e meu numero da sorte é o " + numeroCurto);
    }
}
