public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void diminuirVolume(){
        volume--;
        System.out.println("Baixando volume para: " + volume);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }


    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

   
}
