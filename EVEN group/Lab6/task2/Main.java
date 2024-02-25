package task2;

public class Main {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();

        LogingController logingController = new LogingController();

        logingController.setLogger(consoleLogger);
        logingController.log("NullPointer Exception", Loggable.LogType.ERROR);
    }
}
