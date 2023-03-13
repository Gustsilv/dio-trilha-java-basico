public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume = 25; 


    public void aumentarVolume(){
        volume++; //ou equivalente a volume = volume +1;
        System.out.println("Aumentando volume para:  " + volume);

    }

    public void diminuirVolume(){
        volume--; //ou equivalente a volume = volume -1;
        System.out.println("Diminuindo volume para:  " + volume);
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
}
