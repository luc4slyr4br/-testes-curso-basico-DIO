package smartTV;

public class Usuario {
    static void main() {
        SmartTV smartTV = new SmartTV();

        smartTV.ligar();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();

        System.out.println("TV ligada? " +smartTV.ligada);
        System.out.println("Volume atual: " +smartTV.volume);
        System.out.println("Canal atual: " +smartTV.canal);
    }
}
