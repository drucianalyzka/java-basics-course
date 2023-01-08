public class Adres {
    private String miejscowosc;
    private String kodPocztowy;
    private String nazwaUlicy;
    private int nrDomu;

    public Adres(String miejscowosc, String kodPocztowy, String nazwaUlicy, int nrDomu) {
        this.miejscowosc = miejscowosc;
        this.kodPocztowy = kodPocztowy;
        this.nazwaUlicy = nazwaUlicy;
        this.nrDomu = nrDomu;
    }

    public String toString() {
        return "adres: ul. " + nazwaUlicy + " " + nrDomu + ", " + kodPocztowy + " " + miejscowosc;

    }
    public static void main(String[] args) {
        Adres adres = new Adres("Kraków", "31-687", "Krasickiego", 4 );

        System.out.println(adres);
    }
}
