package LoggingFramework;

public class InfoLogger extends AbstractLogger {

    protected InfoLogger(int levels) {
        this.levels = levels;
    }
    @Override
    protected void display(String message, LoggerSubject loggerSubject) {
         loggerSubject.notifyAllObserver(1, "Info : "+message );
    }
}
