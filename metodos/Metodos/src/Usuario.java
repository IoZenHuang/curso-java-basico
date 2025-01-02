public class Usuario {
    public static void main(String[] args) {
        System.out.println("Olá, JO ZEN HUNAG!");

        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.desligarTv();

        System.out.println("A Tv está ligada? " + smartTv.status);
        System.out.println("O volume da Tv é: " + smartTv.volume);
        System.out.println("O canal da Tv é: " + smartTv.canal);

    }
}
