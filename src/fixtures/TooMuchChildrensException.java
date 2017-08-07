package fixtures;

/**
 * Created by andriy on 3/6/17.
 */
public class TooMuchChildrensException extends Exception {
    public TooMuchChildrensException() {
    }

    public TooMuchChildrensException(String message) {
        super(message);
    }
}
