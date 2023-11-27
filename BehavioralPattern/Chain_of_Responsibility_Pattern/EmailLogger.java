package BehavioralPattern.Chain_of_Responsibility_Pattern;

public class EmailLogger extends Logger {
 
    public EmailLogger(LogLevel logLevel) {
        super(logLevel);
    }
 
    @Override
    protected void writeMessage(String msg) {
        System.out.println("Email logger: " + msg);
    }
}
