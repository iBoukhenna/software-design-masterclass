package hr.logging;

public class ConsoleLogger {
    public void writeInfo(String message){
        System.out.println("Info: " + message);
    }
    public void writeError(String message, Exception e){
        System.out.println("Error: " + message + ";" + e);
    }
}
