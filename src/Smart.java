public class Smart {

    boolean ligada=false;
    boolean desligada= true;

    int canal = 1;
    int volume = 25;

    public void MudarCanal ( int novoCanal){
        canal= novoCanal;
    }
    public void AumentarCanal(){
        canal++;
    }
    public void DiminuirCanal (){
        canal--;

    }


public void aumentarVolume (){
    volume++;
    System.out.println("Aumentando volume para: " + volume);
}
public void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo volume para:  " + volume );
}

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        desligada=false;
    }
}