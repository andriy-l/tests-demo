package testcasses2;

/**
 * Created by andriy on 3/8/17.
 */
public class MessageUtil {

    private String message;
    public MessageUtil(String message) {
        this.message = message;
    }

    public String salutationMessage() {
        return "Hi!";
    }

    public String printMessage() {
        return message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
