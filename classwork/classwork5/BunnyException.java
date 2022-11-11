public class BunnyException extends Exception{
    public BunnyException() {
    }

    public BunnyException(String message) {
        super(message);
    }

    public BunnyException(String message, Throwable cause) {
        super(message, cause);
    }

    public BunnyException(Throwable cause) {
        super(cause);
    }

    public BunnyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
