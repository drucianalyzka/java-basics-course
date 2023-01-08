public class ZagadkaReferencje2 {
    private final int[] liczby;

    public ZagadkaReferencje2(int[] liczby) {
        this.liczby = liczby;
    }
    public int sumaLiczb() {
        int suma = 0;
        for (int x : liczby) {
            suma += x;
        }
        return suma;
    }
    public static void main(String[] args) {
        int[] liczby = { 1, 10, 100 };

        ZagadkaReferencje2 o1 = new ZagadkaReferencje2(liczby);
        ZagadkaReferencje2 o2 = new ZagadkaReferencje2(liczby);
        liczby[0] = -100;
        System.out.println(o1.sumaLiczb());
        System.out.println(o2.sumaLiczb());
    }
}