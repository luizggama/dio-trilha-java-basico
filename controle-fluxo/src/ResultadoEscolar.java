import java.text.DecimalFormat;

public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 6.80;
        DecimalFormat df = new DecimalFormat("#0.00");

        ////BLOCO DE CÓDIGO NO MODO PADRÃO
        if (nota >= 7) {
            System.out.println("Aprovado!");
        } 
        else if (nota >=5 && nota < 7) {
            double pontosFaltantes = 7.0 - nota;
            System.out.println("Recuperação! Você precisa de mais " + df.format(pontosFaltantes) + " pontos para ser aprovado. Entre em contato com a secretaria para agendar sua prova");
        }
        else {
            System.out.println("Reprovado!");
        }
        

        ///MESMO BLOCO QUE O DE CIMA, PORÉM UTILIZANDO O OPERADOR TERNÁRIO (TUDO EM UMA LINHA)
        String resultado = (nota >= 7) ? "Aprovado!" : (nota >=5 && nota < 7) ? "Recuperação!" : "Reprovado!";
        System.out.println(resultado);
    }
}
