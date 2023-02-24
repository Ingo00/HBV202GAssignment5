package is.hi.hbv202g.ass5;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class testStackisalmostFull {
    @Test
    public void testNewStackIsalmostfull() {
        IntStack myStack = new IntStack();
        int capacity = myStack.getCapacity();

        for (int i = 1; i < capacity; i++) {
            myStack.push(i);
        }
        //IntStack stack= new IntStack();

        assertFalse(myStack.isFull());
    }
}
