package LoggingFramework;

public abstract class AbstractLogger {
    int levels;

   private AbstractLogger nextLevelLogger;

   void setNextLevelLogger(AbstractLogger nextLevelLogger) {
       this.nextLevelLogger = nextLevelLogger;
   }

   void logMessage(int levels, String message , LoggerSubject loggerSubject) {
       if(this.levels == levels) {
           display(message, loggerSubject);
       }
       if(nextLevelLogger != null) {
           nextLevelLogger.logMessage(levels, message, loggerSubject);
       }
   }

   protected abstract void display(String message, LoggerSubject loggerSubject);


}
