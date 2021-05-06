package exception;

public class EmailUniqueException extends Exception{
    public EmailUniqueException() {
        super();
    }

    public EmailUniqueException(String message) {
        super(message);
    }
}
