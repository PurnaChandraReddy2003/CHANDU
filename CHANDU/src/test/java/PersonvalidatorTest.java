import org.junit.Test;
import static org.junit.Assert.*;

public class PersonvalidatorTest {

    @Test
    public void testValidatePersonValid() {
        String result = Personvalidator.validatePerson("ram", 3025);
        assertEquals("Valid Person", result);
    }

    @Test
    public void testValidatePersonInvalid() {
        String result = Personvalidator.validatePerson("john", 1234);
        assertEquals("Invalid Person", result);
    }
}
