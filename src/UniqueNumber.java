public class UniqueNumber {

    private static int id = 0;

    public static int generate() {
        return id++;
    }

    public static void resetCounter() {
        id = 0;
    }
}
