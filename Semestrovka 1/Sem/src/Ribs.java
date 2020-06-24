public class Ribs {
    private int rib0;
    private int rib1;
    public Ribs(int rib0, int rib1) {
        this.rib0 = rib0;
        this.rib1 = rib1;
    }
    public int getRib0() {
        return rib0;
    }
    public int getRib1() {
        return rib1;
    }
    public static boolean equality(Ribs rib1, Ribs rib2) {
        boolean result = false;
        if ((rib1.getRib0() == rib2.getRib0())&&(rib1.getRib1() == rib2.getRib1())) {
            result = true;
        }
        return result;
    }
}
