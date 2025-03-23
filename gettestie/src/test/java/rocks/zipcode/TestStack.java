package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
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
    @Test
    public void arrayList(){
        ArrayList<String> list= new ArrayList<>();
        list.add("Banana");
        list.add("Peanut Butter");

        assertEquals(2, list.size());
        assertEquals("Banana", list.get(0));
    }
    @Test
    public void hashMap(){
        HashMap<String, Integer> map= new HashMap<>();
        map.put("Banana", 2);
        map.put("Avocado", 3);

        assertEquals(2,map.size());
        assertTrue(map.containsKey("Avocado"));

    }
    // Make a bigger test exercising more Stack methods.....
}
