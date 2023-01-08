public class ZagadkaReferencje {
    private int x;
    public ZagadkaReferencje(int x) {
        this.x = x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public static void main(String[] args) {
        ZagadkaReferencje z1 = new ZagadkaReferencje(5);
        ZagadkaReferencje z2 = z1;
        z2.setX(100);
        System.out.println(z1.getX());
    }
}
