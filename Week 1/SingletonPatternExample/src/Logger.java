public class Logger {

    // Create a single object of Logger class
    private static Logger obj = new Logger();

    // Private constructor prevents object creation using 'new'
    private Logger() {
    }

    // Returns the same Logger object every time
    public static Logger getInstance() {
        return obj;
    }
}