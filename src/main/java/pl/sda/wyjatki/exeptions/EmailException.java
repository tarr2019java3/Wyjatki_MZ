package pl.sda.wyjatki.exeptions;

public class EmailException extends Exception{
    public EmailException() {
    }

    public EmailException(String message) {
        super (message);
    }
}
