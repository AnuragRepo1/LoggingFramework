package LoggingFramework;

import java.io.Serializable;

public class Logger implements Cloneable, Serializable {
    private volatile static Logger logger;
    private volatile static AbstractLogger chainOfLogger;
    private volatile static LoggerSubject loggerSubject;
    private Logger() {
        if (logger != null)
            throw new IllegalStateException("Object already created");
    }

    public static Logger getLogger() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                    chainOfLogger = doChaining();
                    loggerSubject = addObservers();
                }
            }
        }
        return logger;
    }
}
