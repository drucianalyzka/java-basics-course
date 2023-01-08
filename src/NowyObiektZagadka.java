public class NowyObiektZagadka {
    private String wiadomosc;

    public static String info = "Default";

    public NowyObiektZagadka(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }
    public String getWiadomosc() {
        return wiadomosc;
    }
    public static void main(String[] args) {
        System.out.println(NowyObiektZagadka.info);
        NowyObiektZagadka.setInfo("Halo!");
        System.out.println(NowyObiektZagadka.info);


        NowyObiektZagadka obiektZagadka = new NowyObiektZagadka("Cześć");

        final int[] liczby = { 1, 2 , 3 };
        liczby[0] = 5;
        System.out.println(liczby[0]);

    }
    public static void setInfo(String newInfo) {
         newInfo = "NewInfo: " + newInfo;
         info = newInfo;
    }
}
