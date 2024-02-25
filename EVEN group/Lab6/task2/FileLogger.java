package task2;

public class FileLogger implements Loggable{

    @Override
    public void log(String message, LogType logType) {
        System.out.println("Logged into file. Message: " + message + " Type: " + logType);
    }
}
