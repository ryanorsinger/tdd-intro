import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StackTest {
    Stack stack;

    @Before
    public void initialize() {
        stack = new Stack();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPush() {
        assertTrue(stack.isEmpty());
        stack.push("Cat");
        assertFalse(stack.isEmpty());
    }
}
