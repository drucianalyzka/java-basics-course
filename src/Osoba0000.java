import java.util.Arrays;

public class Osoba0000 {
    int wiek;
    String imie;
    String nazwisko;

    public void ustawWiek(int wartoscWieku) {
        wiek = wartoscWieku;
    }

    public void ustawImie(String imieOsoby) {
        imie = imieOsoby;
    }

    public void ustawNazwisko(String nazwiskoOsoby) {
        nazwisko = nazwiskoOsoby;
    }

    public String toString() {
        return "Imię: " + imie + " | Nazwisko: " + nazwisko + " | Wiek: " + wiek;
    }

    private boolean areArraysEqual(Object[] array1, Object[] array2) {
        return Arrays.equals(array1, array2);

    }
}


