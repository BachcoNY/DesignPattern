package BehavioralPattern.Chain_of_Responsibility_Pattern;

public class FileLogger extends Logger {
 
    public FileLogger(LogLevel logLevel) {
        super(logLevel);
    }
 
    @Override
    protected void writeMessage(String msg) {
        System.out.println("File logger: " + msg);
    }
}
