public class Usuario {
    public static void main(String[] args) throws Exception {
        

        SmartTv smartTv = new SmartTv();
        
        smartTv.mudarCanal();
        System.out.println("canal atual?" + smartTv.canal);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        
       

        smartTv.ligar();
        System.out.println("Tv ligada ?" + smartTv.ligada);

    }
}
