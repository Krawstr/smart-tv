public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv(); 

        smartTv.ligar();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("A tv está ligada? : " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.desligar();
        System.out.println("A tv está ligada? : " + smartTv.ligada);

    }
}
