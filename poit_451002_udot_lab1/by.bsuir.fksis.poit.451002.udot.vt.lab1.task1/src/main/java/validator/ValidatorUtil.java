package validator;

/**
 * Created by anastasiya on 17.9.16.
 */
public class ValidatorUtil {

    public static boolean isDigit(String string) throws NumberFormatException {
        try {
            Double.parseDouble(string);
            return true;
        }
        catch (NumberFormatException e1) {
            return false;
        }
    }
}
