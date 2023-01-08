import java.util.Calendar;

public class Osoba {
    private String imie;
    private String nazwisko;
    private final int rokUrodzenia;
    private Adres adres;
    private int age;

    public Osoba(String imie, String nazwisko, int rokUrodzenia, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.adres = adres;

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        this.age = currentYear - rokUrodzenia;
    }

    public Osoba(String imie, String nazwisko, int rokUrodzenia, String miejscowosc, String kodPocztowy, String nazwaUlicy, int nrDomu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.adres = new Adres(miejscowosc, kodPocztowy, nazwaUlicy, nrDomu);
    }

    @Override
    public String toString() {
        return "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", adres=" + adres +
                '}';
    }

    public static void main(String[] agrs) {
        Adres adres = new Adres("Brzesko", "32-800", "Odrodzenia", 15);
        Osoba ja = new Osoba("Joanna", "Ziomek", 1991, adres);
        Osoba matys = new Osoba("Mateusz", "Ziomek", 1991, "Brzesko", "32-800", "Odrodzenia", 15);

        System.out.println(ja);
        System.out.println(matys);


    }
}
