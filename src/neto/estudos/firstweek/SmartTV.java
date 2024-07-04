package neto.estudos.firstweek;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void subirCanal(){
        canal++;
    }

    public void descerCanal() {
        canal--;
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void ligar() {

    }
}
