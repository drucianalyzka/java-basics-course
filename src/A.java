public class A {
    private int liczba;
    public A(int liczba) {
        this.liczba = liczba;
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        A otherLiczba = (A) o;

        return this.liczba == otherLiczba.liczba;
    }

    public static void main(String[] args) {
        A a1 = new A(10);
        A a2 = a1;
        A a3 = new A(10);
        System.out.println("a1 rowne a2? " + a1.equals(a2));
        System.out.println("a1 rowne a3? " + a1.equals(a3));
        System.out.println("a1 rowne null? " + a1.equals(null));
    }
}
