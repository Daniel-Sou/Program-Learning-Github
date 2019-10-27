public class Main {
    public static void main(String[] args) {
        XXX myArray[] = new XXX[5];

        myArray[0] = new XXX(2);
        myArray[1] = new YYY(3);
        myArray[2] = new XXX(4);
        myArray[3] = new YYY(5);
        myArray[4] = new YYY(10);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}