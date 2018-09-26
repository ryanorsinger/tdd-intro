import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StackTest {

    @Test
    public void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPush() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        stack.push("Cat");
        assertFalse(stack.isEmpty());
    }
}
