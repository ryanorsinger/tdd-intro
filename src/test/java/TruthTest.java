import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TruthTest {

    @Test
    public void baseTruth() {
        assertEquals(true, true);
        assertEquals(false, false);
        assertNotEquals(true, false);
    }

}
