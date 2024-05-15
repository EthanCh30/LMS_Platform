import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestTask1 {

    @Test
    public void testDefaultConstructor() {
        StringList stringList = new StringList();
        assertEquals(0, stringList.size(), "Initial size should be 0");
    }

    @Test
    public void testAdd() {
        StringList stringList = new StringList();
        stringList.add("A");
        assertEquals(1, stringList.size(), "Size should be 1 after adding one element");
        assertTrue(stringList.contains("A"), "List should contain 'A' after adding");
    }

    @Test
    public void testGet() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        assertEquals("A", stringList.get(0), "get(0) should return 'A'");
        assertEquals("B", stringList.get(1), "get(1) should return 'B'");
    }

    @Test
    public void testToString() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        assertEquals("Printing List: [A, B]", stringList.toString(), "toString() should return the correct format");
    }

    @Test
    public void testContains() {
        StringList stringList = new StringList();
        stringList.add("A");
        assertTrue(stringList.contains("A"), "List should contain 'A'");
        assertFalse(stringList.contains("B"), "List should not contain 'B'");
    }

    @Test
    public void testIndexOf() {
        StringList stringList = new StringList();
        stringList.add("A");
        stringList.add("B");
        assertEquals(0, stringList.indexOf("A"), "Index of 'A' should be 0");
        assertEquals(1, stringList.indexOf("B"), "Index of 'B' should be 1");
        assertEquals(-1, stringList.indexOf("C"), "Index of 'C' should be -1 (not found)");
    }

    @Test
    public void testSet() {
        StringList stringList = new StringList();
        stringList.add("A");
        assertEquals("A", stringList.set(0, "B"), "set(0, 'B') should return 'A'");
        assertEquals("B", stringList.get(0), "get(0) should return 'B' after setting");
    }

    @Test
    public void testSize() {
        StringList stringList = new StringList();
        assertEquals(0, stringList.size(), "Initial size should be 0");
        stringList.add("A");
        assertEquals(1, stringList.size(), "Size should be 1 after adding one element");
    }
}
