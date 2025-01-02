public class SmartTv {
    boolean status = false;
    int volume = 0;
    int canal = 1;   
    
    public void ligarTv(){
        status = true;
    }

    public void desligarTv(){
        status = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
}
