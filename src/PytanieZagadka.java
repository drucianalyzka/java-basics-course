public class PytanieZagadka {
    public int liczba;
    public int[] liczby;
    public static void main(String[] args) {
        PytanieZagadka zagadka = new PytanieZagadka();
        zagadka.liczba = 5;
        zagadka.liczby = new int[2];
        PytanieZagadka innaZagadka = zagadka;
        int calkowita = zagadka.liczba;
        int[] tablica = innaZagadka.liczby;
        calkowita = 1;
        tablica[0] = 10;
        tablica[1] = 100;
        System.out.println(zagadka.liczba);
        System.out.println(zagadka.liczby[0]);
        System.out.println(innaZagadka.liczby[1]);
    }
}
