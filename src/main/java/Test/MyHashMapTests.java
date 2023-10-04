package Test;

import Questions.MyHashMap.MyHashMap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyHashMapTests {

    private MyHashMap myHashMap;

    @Before
    public void setUp() {
        myHashMap = new MyHashMap();
    }

    @Test
    public void testHashMapOperations() {
        // Test put and get operations
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);

        Assert.assertEquals(1, myHashMap.get(1));
        Assert.assertEquals(-1, myHashMap.get(3));

        // Test remove operation
        myHashMap.put(2, 1);
        Assert.assertEquals(1, myHashMap.get(2));

        myHashMap.remove(2);
        Assert.assertEquals(-1, myHashMap.get(2));
    }
}
