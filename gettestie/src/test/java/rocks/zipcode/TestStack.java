package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }
    @Test
    public void hashSet(){
        HashSet<String>set= new HashSet<>();
        set.add("Blueberries");
        set.add("Strawberries");
        assertTrue(set.contains("Strawberries"));
        assertTrue(set.contains("Blueberries"));
    }

    // Make a bigger test exercising more Stack methods.....
}
