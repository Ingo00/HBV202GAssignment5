package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {

    @Test
    public void testNewStackIsNotFull() {
        IntStack stack = new IntStack();

        assertFalse(stack.isFull());
    }

    @Test
    public void testPopReturnsPushedValue() {
        IntStack stack = new IntStack();
        int pushedValue = 42;
        stack.push(pushedValue);
        int poppedValue = stack.pop();
        assertEquals(pushedValue, poppedValue);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopOnEmptyStack() {
        IntStack myStack = new IntStack();
        myStack.pop();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPushOnFullStack() {
        IntStack myStack = new IntStack();
        for (int i = 1; i <= 5; i++) {
            myStack.push(i);
        }
        myStack.push(6);
    }

    @Test
    public void testIsEmptyOnEmptyStack() {
        IntStack myStack = new IntStack();
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testIsEmptyOnNonEmptyStack() {
        IntStack myStack = new IntStack();
        myStack.push(1);
        assertFalse(myStack.isEmpty());
    }
}