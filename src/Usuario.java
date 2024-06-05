public class Usuario {
    public static void main(String[] args) throws Exception {
Smart Smart = new Smart();


Smart.diminuirVolume();
Smart.diminuirVolume();
Smart.diminuirVolume();
Smart.aumentarVolume();
Smart.aumentarVolume();

Smart.MudarCanal(20); 
System.out.println("Canal Atual :" + Smart.canal);



System.out.println("volume atual : " + Smart.volume);
        System.out.println("TV Ligada ?" + Smart.ligada);
        System.out.println("Canal Atual :" + Smart.canal);
        System.out.println("Volume Atual ?" + Smart.volume);

      Smart.ligar();
      System.out.println("Novo Status -> TV ligada ?" + Smart.ligada);

      Smart.desligar();
      System.out.println("Novo Status -> TV Desligada ?" + Smart.desligada);


    }
}
