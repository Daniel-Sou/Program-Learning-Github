public class XXX {
    private static String whoAmI = "I am an XXX";
    protected static int c = 0;
    private int xxx;

    public XXX(int x) {
        xxx = x;
        c++;
        System.out.println(" - - " + c + " - - ");
    }

    public String toString() {
        return whoAmI + " with a " + xxx + " and a " + c;
    }
}