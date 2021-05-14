import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfVersionIsSet() {
        assertEquals(0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.5;
        assertEquals(1.5, CodeupCrypt.version, 0);
    }

    @Test
    public void testIfHashPasswordWorks() {
        // fer -> f3r
        assertEquals("f3r", CodeupCrypt.hashPassword("fer"));
        assertEquals("C0d39p", CodeupCrypt.hashPassword("Codeup"));
        assertEquals("123", CodeupCrypt.hashPassword("123"));
        assertEquals("124", CodeupCrypt.hashPassword("12a"));
    }

    @Test
    public void testIfPasswordWorks() {
        assertTrue(CodeupCrypt.checkPassword("fer", "f3r"));
        assertFalse(CodeupCrypt.checkPassword("fer", "fer"));
    }
}
