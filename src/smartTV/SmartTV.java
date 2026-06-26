package smartTV;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 12;

    public void mudarCanal(int mudarCanal){
        canal = mudarCanal;
    }

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        volume--;
        System.out.println("Aumentar volume em +1");
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuir volume em -1");
    }
}
