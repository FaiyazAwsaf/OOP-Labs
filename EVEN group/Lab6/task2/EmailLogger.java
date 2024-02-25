package task2;

public class EmailLogger implements Loggable{
    @Override
    public void log(String message, LogType logType) {
        System.out.println("Logged by email. Message: " + message + " Type: " + logType);
    }
}
