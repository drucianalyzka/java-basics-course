public class ZagadkaArgument {
    public static void main(String[] args) {
        double wartosc = 5.0;
        ustawWartosc(wartosc, 10.0);
        System.out.println(wartosc);
    }
    public static void ustawWartosc(
            double wartoscDoZmiany, double nowaWartosc) {
        wartoscDoZmiany = nowaWartosc;
    }
}