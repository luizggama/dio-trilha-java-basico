public class SmartTV {
    boolean ligada=false;
    int canal=25;
    int volume = 25;

    public void ligar() {
        ligada=true;
    }

    public void desligar() {
        ligada=false;
    }

    public void aumentarVolume() {
        //volume=volume+1;
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public int avancarCanal() {
        if (canal > 0 && canal <= 100) {
            canal++;
        } else {;
            canal = 1;
        }
        return canal;
    }

    public int voltarCanal() {
        if (canal > 1) {
            canal--;
        } else {
            canal = 100;
        }
        return canal;
    }
}