public class Meneger {
    private static Meneger meneger;

    private Meneger() {
    }

    public static Meneger getInstance() {
        if (meneger == null) {
            meneger = new Meneger();
        }
        return meneger;
    }

}

