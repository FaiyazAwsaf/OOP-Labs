package task2;

public class LogingController implements Loggable{
    private Loggable logger;

    public void setLogger(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message, LogType logType) {
        if (logger != null) {
            logger.log(message, logType);
        } else {
            System.out.println("Please select a logger");
        }
    }

}
