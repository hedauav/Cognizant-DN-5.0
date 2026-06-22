public class SingletonTest {

    public static void main(String[] args) {

        // Get Logger object
        Logger l1 = Logger.getInstance();

        // Get Logger object again
        Logger l2 = Logger.getInstance();

        // Check if both references point to the same object
        if (l1 == l2) {
            System.out.println("Only one object created");
        } else {
            System.out.println("Different objects created");
        }
    }
}