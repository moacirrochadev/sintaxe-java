package neto.estudos.firstweek;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
    }
}
