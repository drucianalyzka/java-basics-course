import java.util.Arrays;

public class Figura {
    private final Punkt[] wierzcholki;

    public Figura(Punkt[] wierzcholki) {
        this.wierzcholki = wierzcholki;
    }

    public static Figura newSquare(int side) {
        return new Figura(new Punkt[]{new Punkt(0, 0), new Punkt(side, 0), new Punkt(side, side), new Punkt(0, side)});
    }

    public static void main(String[] args) {
        Figura figura1 = Figura.newSquare(4);
        Figura figura2 = new Figura(new Punkt[]{new Punkt(1, 2)});

        System.out.println(figura2.equals(figura1));


    }

    public boolean equals(Object o) {
        if (this.wierzcholki == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Figura other = (Figura) o;

        return Arrays.equals(this.wierzcholki, other.wierzcholki);
    }

}

