package task2;

public class ConsoleLogger implements Loggable{

    @Override
    public void log(String message, LogType logType) {
        System.out.println("Logged into console. Message: " + message + " Type: " + logType);
    }

}
