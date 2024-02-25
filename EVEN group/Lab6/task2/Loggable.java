package task2;

public interface Loggable {

    enum LogType {
        WARNING,
        MESSAGE,
        EVENT,
        ERROR
    }

    void log(String message, LogType logType);
}
