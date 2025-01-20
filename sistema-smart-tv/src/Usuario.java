public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();
        
        while(true && smartTV.canal <=100) {
            smartTV.avancarCanal();
            System.out.println("Você está no canal: " + smartTV.canal);
        }        

        System.out.println("Você voltou para o canal " + smartTV.canal);
    }
}


        //System.out.println("TV Ligada?" +smartTV.ligada);
        //System.out.println("Canal atual: " +smartTV.canal);
        //System.out.println("Volume atual: " +smartTV.volume);
    
        //smartTV.ligar();
        //System.out.println("Novo Status - TV Ligada?" +smartTV.ligada);

        //smartTV.desligar();
        //System.out.println("Novo Status - TV Ligada?" +smartTV.ligada);
