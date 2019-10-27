public class YYY extends XXX {
    private static String whoAmI = "I am a YYY";
    private int yyy;

    public YYY(int y) {
        super(y);
        yyy = y;
        System.out.println(" * * " + c + " * * ");
    }

    public String toString() {
        return whoAmI + " with a " + yyy + " and a " + c;
    }
}