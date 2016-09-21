import org.junit.Test;
import validator.ValidatorUtil;
import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class ValidatorUtilTester {

    @Test
    public void testValidatorStringValue(){
        ValidatorUtil validator = new ValidatorUtil();
        assertTrue(!validator.isDigit("string"));
    }

    @Test
    public void testValidatorDoubleValue(){
        ValidatorUtil validator = new ValidatorUtil();
        assertTrue(validator.isDigit("0.05"));
    }
}
