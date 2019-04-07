package at.fhj.iit;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringStackTest
{
    public Stack s;
    
    @Before
    public void setup() throws Exception {
        s = new StringStack(5); // keep size of 5 !
    }
    
    /**
     * tests if stack is empty after initialization
     * 
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(s.isEmpty());
    }
    
    /**
     * tests if stack is empty after pushing
     * 
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception {
        s.push("test");
        assertFalse(s.isEmpty());
    }

    /**
     * tests push and pop function
     * 
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     * @throws Exception 
     */
    @Test
    public void testPushPop() throws Exception {
        s.push("PushPop");
        assertFalse(s.isEmpty());
        s.pop();
        assertTrue(s.isEmpty());
    }
    
    /**
     * Feel Free to insert other test cases for the String Stack Implementation !!!
     */

    /**
     * test pop function
     *
     * it pops a non existing element of a stack and should throw an exception
     * @throws Exception
     */
    @Test(expected = IllegalStateException.class)
    public void testEmptyPop() throws Exception {
        s.pop();
    }

    /**
     * test push function
     *
     * it pushes 6 elements. With the 6. Element it should throw an exception.
     * @throws Exception
     */
    @Test(expected =  IllegalStateException.class)
    public void testMaxPush() throws Exception {
        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        s.push("5");
        s.push("6");
    }
    /**
     * test Constructor function
     *
     * if the capacity is <= 0 it should throw an exception
     * @throws Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMinCapacity() throws Exception {
        s = new StringStack(0);
    }
}
