public class Punkt {
    private final int x;
    private final int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Punkt other = (Punkt) o;

        return this.x == other.x && this.y == other.y;
    }

    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(4,-5);
        Punkt punkt2 = new Punkt(4,-5);

        System.out.println(punkt2.equals(punkt1));
    }
}
