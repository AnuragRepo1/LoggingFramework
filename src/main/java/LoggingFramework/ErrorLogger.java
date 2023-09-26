package LoggingFramework;

public class ErrorLogger implements LogObserver{
    @Override
    public void log(String message) {
        System.out.println("Writing to File " + message);
    }
}
