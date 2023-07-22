public class InvalidQuantityException extends RuntimeException {
    public InvalidQuantityException() {
        super("Quantity cannot be less than 1");
    }
}
