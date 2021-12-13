package src.education.exception;

public class studentNotFoundException extends Exception{

    public studentNotFoundException() {
    }

    public studentNotFoundException(String message) {
        super(message);
    }

    public studentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public studentNotFoundException(Throwable cause) {
        super(cause);
    }

    public studentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
