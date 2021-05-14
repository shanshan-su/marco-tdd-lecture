import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfVersionIsSet() {
        assertEquals(0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.5;
        assertEquals(1.5, CodeupCrypt.version, 0);
    }
}
