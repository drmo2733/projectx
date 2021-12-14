package src.education.exception;

public class userNotFoundException extends Exception{
    public userNotFoundException() {
    }

    public userNotFoundException(String message) {
        super(message);
    }

    public userNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public userNotFoundException(Throwable cause) {
        super(cause);
    }

    public userNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
