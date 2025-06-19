public class SingletonPattern {
 public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started");

        System.out.println("Using logger1 to log:");
        logger.log("Message from logger1");
        Logger anotherLogger = Logger.getInstance();
	System.out.println("Using logger2 to log:");
        anotherLogger.log("This is also the same logger");
    }
}