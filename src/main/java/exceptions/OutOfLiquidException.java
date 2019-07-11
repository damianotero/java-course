package exceptions;

public class OutOfLiquidException extends Exception{

    public OutOfLiquidException() {
    }

    public OutOfLiquidException(String message) {
        super(message);
    }

    public OutOfLiquidException(String message, Throwable cause) {
        super(message, cause);
    }
}
